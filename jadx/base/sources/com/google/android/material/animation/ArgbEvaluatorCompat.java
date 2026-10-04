package com.google.android.material.animation;

import OooOO0.OooO0OO;
import android.animation.TypeEvaluator;

/* JADX INFO: loaded from: classes7.dex */
public class ArgbEvaluatorCompat implements TypeEvaluator<Integer> {
    private static final ArgbEvaluatorCompat instance = new ArgbEvaluatorCompat();

    public static ArgbEvaluatorCompat getInstance() {
        return instance;
    }

    @Override // android.animation.TypeEvaluator
    public Integer evaluate(float f, Integer num, Integer num2) {
        int iIntValue = num.intValue();
        float f2 = ((iIntValue >> 24) & 255) / 255.0f;
        int iIntValue2 = num2.intValue();
        float f3 = ((iIntValue2 >> 24) & 255) / 255.0f;
        float fPow = (float) Math.pow(((iIntValue >> 16) & 255) / 255.0f, 2.2d);
        float fPow2 = (float) Math.pow(((iIntValue >> 8) & 255) / 255.0f, 2.2d);
        float fPow3 = (float) Math.pow((iIntValue & 255) / 255.0f, 2.2d);
        float fPow4 = (float) Math.pow(((iIntValue2 >> 16) & 255) / 255.0f, 2.2d);
        float fPow5 = (float) Math.pow(((iIntValue2 >> 8) & 255) / 255.0f, 2.2d);
        float fPow6 = (float) Math.pow((iIntValue2 & 255) / 255.0f, 2.2d);
        float fOooO0O0 = OooO0OO.OooO0O0(f3, f2, f, f2);
        float fOooO0O02 = OooO0OO.OooO0O0(fPow4, fPow, f, fPow);
        float fOooO0O03 = OooO0OO.OooO0O0(fPow5, fPow2, f, fPow2);
        float fOooO0O04 = OooO0OO.OooO0O0(fPow6, fPow3, f, fPow3);
        float fPow7 = ((float) Math.pow(fOooO0O02, 0.45454545454545453d)) * 255.0f;
        float fPow8 = ((float) Math.pow(fOooO0O03, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(fOooO0O04, 0.45454545454545453d)) * 255.0f) | (Math.round(fPow7) << 16) | (Math.round(fOooO0O0 * 255.0f) << 24) | (Math.round(fPow8) << 8));
    }
}
