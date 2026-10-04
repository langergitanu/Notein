package com.google.android.material.carousel;

import OooOoO.C20509OooO0oo;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes7.dex */
public final class MultiBrowseCarouselStrategy extends CarouselStrategy {
    private int keylineCount = 0;
    private static final int[] SMALL_COUNTS = {1};
    private static final int[] MEDIUM_COUNTS = {1, 0};

    public boolean ensureArrangementFitsItemCount(Arrangement arrangement, int i) {
        int itemCount = arrangement.getItemCount() - i;
        boolean z = itemCount > 0 && (arrangement.smallCount > 0 || arrangement.mediumCount > 1);
        while (itemCount > 0) {
            int i2 = arrangement.smallCount;
            if (i2 > 0) {
                arrangement.smallCount = i2 - 1;
            } else {
                int i3 = arrangement.mediumCount;
                if (i3 > 1) {
                    arrangement.mediumCount = i3 - 1;
                }
            }
            itemCount--;
        }
        return z;
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    public KeylineState onFirstChildMeasuredWithMargins(Carousel carousel, View view) {
        float containerHeight = carousel.getContainerHeight();
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
        }
        float f = containerHeight;
        RecyclerView.C22066OooOOOo c22066OooOOOo = (RecyclerView.C22066OooOOOo) view.getLayoutParams();
        float f2 = ((ViewGroup.MarginLayoutParams) c22066OooOOOo).topMargin + ((ViewGroup.MarginLayoutParams) c22066OooOOOo).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (carousel.isHorizontal()) {
            f2 = ((ViewGroup.MarginLayoutParams) c22066OooOOOo).leftMargin + ((ViewGroup.MarginLayoutParams) c22066OooOOOo).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float f3 = f2;
        float smallItemSizeMin = getSmallItemSizeMin() + f3;
        float fMax = Math.max(getSmallItemSizeMax() + f3, smallItemSizeMin);
        float fMin = Math.min(measuredHeight + f3, f);
        float fClamp = MathUtils.clamp((measuredHeight / 3.0f) + f3, smallItemSizeMin + f3, fMax + f3);
        float f4 = (fMin + fClamp) / 2.0f;
        int[] iArrDoubleCounts = SMALL_COUNTS;
        if (f < 2.0f * smallItemSizeMin) {
            iArrDoubleCounts = new int[]{0};
        }
        int[] iArrDoubleCounts2 = MEDIUM_COUNTS;
        if (carousel.getCarouselAlignment() == 1) {
            iArrDoubleCounts = CarouselStrategy.doubleCounts(iArrDoubleCounts);
            iArrDoubleCounts2 = CarouselStrategy.doubleCounts(iArrDoubleCounts2);
        }
        int[] iArr = iArrDoubleCounts2;
        int[] iArr2 = iArrDoubleCounts;
        int iMax = (int) Math.max(1.0d, Math.floor(C20509OooO0oo.OooO0O0(fMax, CarouselStrategyHelper.maxValue(iArr2), f - (CarouselStrategyHelper.maxValue(iArr) * f4), fMin)));
        int iCeil = (int) Math.ceil(f / fMin);
        int i = (iCeil - iMax) + 1;
        int[] iArr3 = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr3[i2] = iCeil - i2;
        }
        Arrangement arrangementFindLowestCostArrangement = Arrangement.findLowestCostArrangement(f, fClamp, smallItemSizeMin, fMax, iArr2, f4, iArr, fMin, iArr3);
        this.keylineCount = arrangementFindLowestCostArrangement.getItemCount();
        if (ensureArrangementFitsItemCount(arrangementFindLowestCostArrangement, carousel.getItemCount())) {
            arrangementFindLowestCostArrangement = Arrangement.findLowestCostArrangement(f, fClamp, smallItemSizeMin, fMax, new int[]{arrangementFindLowestCostArrangement.smallCount}, f4, new int[]{arrangementFindLowestCostArrangement.mediumCount}, fMin, new int[]{arrangementFindLowestCostArrangement.largeCount});
        }
        return CarouselStrategyHelper.createKeylineState(view.getContext(), f3, f, arrangementFindLowestCostArrangement, carousel.getCarouselAlignment());
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    public boolean shouldRefreshKeylineState(Carousel carousel, int i) {
        if (i >= this.keylineCount || carousel.getItemCount() < this.keylineCount) {
            return i >= this.keylineCount && carousel.getItemCount() < this.keylineCount;
        }
        return true;
    }
}
