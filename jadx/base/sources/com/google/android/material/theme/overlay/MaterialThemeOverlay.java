package com.google.android.material.theme.overlay;

import OooOO0o.OooO0OO;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.C15966R;

/* JADX INFO: loaded from: classes7.dex */
public class MaterialThemeOverlay {
    private static final int[] ANDROID_THEME_OVERLAY_ATTRS = {R.attr.theme, C15966R.attr.theme};
    private static final int[] MATERIAL_THEME_OVERLAY_ATTR = {C15966R.attr.materialThemeOverlay};

    private MaterialThemeOverlay() {
    }

    private static int obtainAndroidThemeOverlayId(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ANDROID_THEME_OVERLAY_ATTRS);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    private static int obtainMaterialThemeOverlayId(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, MATERIAL_THEME_OVERLAY_ATTR, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static Context wrap(Context context, AttributeSet attributeSet, int i, int i2) {
        int iObtainMaterialThemeOverlayId = obtainMaterialThemeOverlayId(context, attributeSet, i, i2);
        boolean z = (context instanceof OooO0OO) && ((OooO0OO) context).f58323OooO00o == iObtainMaterialThemeOverlayId;
        if (iObtainMaterialThemeOverlayId == 0 || z) {
            return context;
        }
        OooO0OO oooO0OO = new OooO0OO(context, iObtainMaterialThemeOverlayId);
        int iObtainAndroidThemeOverlayId = obtainAndroidThemeOverlayId(context, attributeSet);
        if (iObtainAndroidThemeOverlayId != 0) {
            oooO0OO.getTheme().applyStyle(iObtainAndroidThemeOverlayId, true);
        }
        return oooO0OO;
    }
}
