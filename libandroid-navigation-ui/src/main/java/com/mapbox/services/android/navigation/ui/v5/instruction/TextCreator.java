package com.mapbox.services.android.navigation.ui.v5.instruction;

import com.mapbox.api.directions.v5.models.BannerComponents;

/**
 * This is the default text coordinator implementation to handle plain text components.
 */
class TextCreator extends NodeCreator<BannerComponentNode, TextVerifier> {
  TextCreator() {
    this(new TextVerifier());
  }

  TextCreator(TextVerifier textVerifier) {
    super(textVerifier);
  }

  @Override
  BannerComponentNode setupNode(BannerComponents components, int index, int startIndex) {
    return new BannerComponentNode(components, startIndex);
  }
}