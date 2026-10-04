package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes7.dex */
public class FullScreenCarouselStrategy extends CarouselStrategy {
    @Override // com.google.android.material.carousel.CarouselStrategy
    public KeylineState onFirstChildMeasuredWithMargins(Carousel carousel, View view) {
        float containerHeight;
        int i;
        int i2;
        RecyclerView.C22066OooOOOo c22066OooOOOo = (RecyclerView.C22066OooOOOo) view.getLayoutParams();
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
            i = ((ViewGroup.MarginLayoutParams) c22066OooOOOo).leftMargin;
            i2 = ((ViewGroup.MarginLayoutParams) c22066OooOOOo).rightMargin;
        } else {
            containerHeight = carousel.getContainerHeight();
            i = ((ViewGroup.MarginLayoutParams) c22066OooOOOo).topMargin;
            i2 = ((ViewGroup.MarginLayoutParams) c22066OooOOOo).bottomMargin;
        }
        float f = i + i2;
        float f2 = containerHeight;
        return CarouselStrategyHelper.createLeftAlignedKeylineState(view.getContext(), f, f2, new Arrangement(0, 0.0f, 0.0f, 0.0f, 0, 0.0f, 0, Math.min(f2 + f, f2), 1, f2));
    }
}
