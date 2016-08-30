define([
  'document/annotation/common/selection/abstractHighlighter',
  'document/annotation/image/selection/layers/point/pointLayer',
  'document/annotation/image/selection/layers/toponym/toponymLayer'
], function(AbstractHighlighter, PointLayer, ToponymLayer) {

    var Highlighter = function(containerEl, olMap) {

          /** The list of layer implementations **/
      var layers = {
            point : new PointLayer(containerEl, olMap),
            toponym : new ToponymLayer(containerEl, olMap)
          },

          /** Returns the layer appropriate to the annotation **/
          getLayer = function(annotation) {
            var anchor = annotation.anchor,
                shapeType = anchor.substring(0, anchor.indexOf(':')).toLowerCase();

            return layers[shapeType];
          },

          getAnnotationAt = function(e) {
            var allAnnotations = [];

            jQuery.each(layers, function(key, layer) {
              var result = layer.getAnnotationAt(e);
              if (result)
               allAnnotations.push(result);
            });

            // TODO sort by size and pick smallest

            if (allAnnotations.length > 0)
              return allAnnotations[0];
          },

          /** @override **/
          findById = function() {
            var found = [];

            jQuery.each(layers, function(key, layer) {
              var result = layer.findById();
              if (result)
               found.push(result);
            });

            if (found.length > 0)
              return found[0];
          },

          /** @override **/
          initPage = function(annotations) {
            jQuery.each(annotations, function(idx, a) {
              var layer = getLayer(a);
              if (layer) layer.addAnnotation(a);
            });

            jQuery.each(layers, function(key, layer) {
              layer.render();
            });
          },

          /** @override **/
          refreshAnnotation = function(annotation) {
            var layer = getLayer(annotation);
            if (layer) layer.refreshAnnotation(annotation);
          },

          /** @override **/
          removeAnnotation = function() {
            var layer = getLayer(annotation);
            if (layer) layer.removeAnnotation(annotation);
          };

      this.getAnnotationAt = getAnnotationAt;
      this.findById = findById;
      this.initPage = initPage;
      this.refreshAnnotation = refreshAnnotation;
      this.removeAnnotation = removeAnnotation;

      AbstractHighlighter.apply(this);
    };
    Highlighter.prototype = Object.create(AbstractHighlighter.prototype);

    return Highlighter;

});
