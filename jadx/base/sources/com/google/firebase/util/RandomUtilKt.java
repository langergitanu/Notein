package com.google.firebase.util;

import androidx.appcompat.widget.C21532OooOOo;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO0O00o.OooO0OO;
import oO0O00oo.C32520OooO0oo;
import oO0O00oo.OooO;
import oO0O00oo.OooOO0;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.OooOo;
import oOo000Oo.Oooo000;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\"\u001a\u0010\u0006\u001a\u00020\u00038\u0002X\u0082T¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\b\u0010\t¨\u0006\n"}, m80612d2 = {"LoO0O00o/OooO0OO;", "", "length", "", "nextAlphanumericString", "(LoO0O00o/OooO0OO;I)Ljava/lang/String;", "ALPHANUMERIC_ALPHABET", "Ljava/lang/String;", "getALPHANUMERIC_ALPHABET$annotations", "()V", "com.google.firebase-firebase-common"}, m80613k = 2, m80614mv = {2, 0, 0}, m80616xi = 48)
public final class RandomUtilKt {
    private static final String ALPHANUMERIC_ALPHABET = "23456789abcdefghjkmnpqrstvwxyz";

    private static /* synthetic */ void getALPHANUMERIC_ALPHABET$annotations() {
    }

    public static final String nextAlphanumericString(OooO0OO oooO0OO, int i) {
        OooOOO0.OooO0oO(oooO0OO, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "invalid length: ").toString());
        }
        OooO OooO2 = OooOO0.OooO(0, i);
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(OooO2, 10));
        Iterator<Integer> it = OooO2.iterator();
        while (((C32520OooO0oo) it).f116817OooOoO0) {
            ((Oooo000) it).nextInt();
            arrayList.add(Character.valueOf(ALPHANUMERIC_ALPHABET.charAt(oooO0OO.OooO00o(30))));
        }
        return OooOo.o000oOoO(arrayList, "", null, null, null, 62);
    }
}
