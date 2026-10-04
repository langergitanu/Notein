package com.google.android.material.carousel;

import OooOoO.C20509OooO0oo;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes7.dex */
public class HeroCarouselStrategy extends CarouselStrategy {
    private int keylineCount = 0;
    private static final int[] SMALL_COUNTS = {1};
    private static final int[] MEDIUM_COUNTS = {0, 1};

    @Override // com.google.android.material.carousel.CarouselStrategy
    public KeylineState onFirstChildMeasuredWithMargins(Carousel carousel, View view) {
        int containerHeight = carousel.getContainerHeight();
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
        }
        RecyclerView.C22066OooOOOo c22066OooOOOo = (RecyclerView.C22066OooOOOo) view.getLayoutParams();
        float f = ((ViewGroup.MarginLayoutParams) c22066OooOOOo).topMargin + ((ViewGroup.MarginLayoutParams) c22066OooOOOo).bottomMargin;
        float measuredWidth = view.getMeasuredWidth() * 2;
        if (carousel.isHorizontal()) {
            f = ((ViewGroup.MarginLayoutParams) c22066OooOOOo).leftMargin + ((ViewGroup.MarginLayoutParams) c22066OooOOOo).rightMargin;
            measuredWidth = view.getMeasuredHeight() * 2;
        }
        float smallItemSizeMin = getSmallItemSizeMin() + f;
        float fMax = Math.max(getSmallItemSizeMax() + f, smallItemSizeMin);
        float f2 = containerHeight;
        float fMin = Math.min(measuredWidth + f, f2);
        float fClamp = MathUtils.clamp((measuredWidth / 3.0f) + f, smallItemSizeMin + f, fMax + f);
        float f3 = (fMin + fClamp) / 2.0f;
        int i = 0;
        int[] iArr = f2 < 2.0f * smallItemSizeMin ? new int[]{0} : SMALL_COUNTS;
        int iMax = (int) Math.max(1.0d, Math.floor(C20509OooO0oo.OooO0O0(fMax, CarouselStrategyHelper.maxValue(r0), f2, fMin)));
        int iCeil = (((int) Math.ceil(f2 / fMin)) - iMax) + 1;
        int[] iArr2 = new int[iCeil];
        for (int i2 = 0; i2 < iCeil; i2++) {
            iArr2[i2] = iMax + i2;
        }
        int i3 = carousel.getCarouselAlignment() == 1 ? 1 : 0;
        Arrangement arrangementFindLowestCostArrangement = Arrangement.findLowestCostArrangement(f2, fClamp, smallItemSizeMin, fMax, i3 != 0 ? CarouselStrategy.doubleCounts(iArr) : iArr, f3, i3 != 0 ? CarouselStrategy.doubleCounts(MEDIUM_COUNTS) : MEDIUM_COUNTS, fMin, iArr2);
        this.keylineCount = arrangementFindLowestCostArrangement.getItemCount();
        if (arrangementFindLowestCostArrangement.getItemCount() > carousel.getItemCount()) {
            arrangementFindLowestCostArrangement = Arrangement.findLowestCostArrangement(f2, fClamp, smallItemSizeMin, fMax, iArr, f3, MEDIUM_COUNTS, fMin, iArr2);
        } else {
            i = i3;
        }
        return CarouselStrategyHelper.createKeylineState(view.getContext(), f, f2, arrangementFindLowestCostArrangement, i);
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    public boolean shouldRefreshKeylineState(Carousel carousel, int i) {
        if (carousel.getCarouselAlignment() == 1) {
            return (i < this.keylineCount && carousel.getItemCount() >= this.keylineCount) || (i >= this.keylineCount && carousel.getItemCount() < this.keylineCount);
        }
        return false;
    }
}
