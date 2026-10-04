package com.miui.penengine.p596e;

import android.graphics.ColorSpace;
import android.os.Bundle;
import android.util.SparseArray;
import com.miui.penengine.colorpick.MiuiColorPick;
import com.miui.penengine.p594c.C18759b;

/* JADX INFO: renamed from: com.miui.penengine.e.a */
/* JADX INFO: loaded from: classes9.dex */
public class C18766a {

    /* JADX INFO: renamed from: b */
    public static final String f57182b = "color";

    /* JADX INFO: renamed from: c */
    public static final String f57183c = "color_space";

    /* JADX INFO: renamed from: d */
    public static final String f57184d = "a";

    /* JADX INFO: renamed from: e */
    public static final SparseArray<ColorSpace.Named> f57185e;

    /* JADX INFO: renamed from: a */
    public MiuiColorPick.ColorListener f57186a;

    static {
        SparseArray<ColorSpace.Named> sparseArray = new SparseArray<>();
        f57185e = sparseArray;
        sparseArray.put(0, ColorSpace.Named.SRGB);
        sparseArray.put(1, ColorSpace.Named.LINEAR_SRGB);
        sparseArray.put(2, ColorSpace.Named.EXTENDED_SRGB);
        sparseArray.put(3, ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        sparseArray.put(4, ColorSpace.Named.BT709);
        sparseArray.put(5, ColorSpace.Named.BT2020);
        sparseArray.put(6, ColorSpace.Named.DCI_P3);
        sparseArray.put(7, ColorSpace.Named.DISPLAY_P3);
        sparseArray.put(8, ColorSpace.Named.NTSC_1953);
        sparseArray.put(9, ColorSpace.Named.SMPTE_C);
        sparseArray.put(10, ColorSpace.Named.ADOBE_RGB);
        sparseArray.put(11, ColorSpace.Named.PRO_PHOTO_RGB);
        sparseArray.put(12, ColorSpace.Named.ACES);
        sparseArray.put(13, ColorSpace.Named.ACESCG);
        sparseArray.put(14, ColorSpace.Named.CIE_XYZ);
        sparseArray.put(15, ColorSpace.Named.CIE_LAB);
    }

    /* JADX INFO: renamed from: a */
    public final ColorSpace m80319a(int i) {
        C18759b.m80277c(f57184d, "Color space ordinal = " + i);
        ColorSpace.Named named = f57185e.get(i);
        return named != null ? ColorSpace.get(named) : ColorSpace.get(ColorSpace.Named.SRGB);
    }

    /* JADX INFO: renamed from: a */
    public void m80321a(Bundle bundle) {
        if (this.f57186a == null) {
            return;
        }
        this.f57186a.onChange(m80319a(bundle.getInt("color_space")), bundle.getInt("color"));
    }

    /* JADX INFO: renamed from: a */
    public void m80322a(MiuiColorPick.ColorListener colorListener) {
        this.f57186a = colorListener;
    }

    /* JADX INFO: renamed from: a */
    public void m80320a() {
        this.f57186a = null;
    }
}
