package com.aspose.words.internal;

import com.aspose.words.internal.zzYM1;
import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZAD {
    static final Hashtable zzWEw;
    static final Hashtable zzWHv;
    static final Hashtable zzWHx;

    static {
        Hashtable hashtable = new Hashtable();
        zzWHx = hashtable;
        Hashtable hashtable2 = new Hashtable();
        zzWEw = hashtable2;
        Hashtable hashtable3 = new Hashtable();
        zzWHv = hashtable3;
        BigInteger bigInteger = new BigInteger("115792089237316195423570985008687907853269984665640564039457584007913129639319");
        BigInteger bigInteger2 = new BigInteger("115792089237316195423570985008687907853073762908499243225378155805079068850323");
        BigInteger bigInteger3 = new BigInteger("115792089237316195423570985008687907853269984665640564039457584007913129639316");
        BigInteger bigInteger4 = new BigInteger("166");
        BigInteger bigInteger5 = zzYM2.ONE;
        zzYM1.zzV zzv = new zzYM1.zzV(bigInteger, bigInteger3, bigInteger4, bigInteger2, bigInteger5);
        zzZ33 zzz33 = new zzZ33(zzv, zzv.zzY(new BigInteger("1"), new BigInteger("64033881142927202683649881450433473985931760268884941288852745803908878638612")), bigInteger2, bigInteger5);
        zzZDA zzzda = zzZAE.zzWEF;
        hashtable2.put(zzzda, zzz33);
        BigInteger bigInteger6 = new BigInteger("115792089237316195423570985008687907853269984665640564039457584007913129639319");
        BigInteger bigInteger7 = new BigInteger("115792089237316195423570985008687907853073762908499243225378155805079068850323");
        zzYM1.zzV zzv2 = new zzYM1.zzV(bigInteger6, new BigInteger("115792089237316195423570985008687907853269984665640564039457584007913129639316"), new BigInteger("166"), bigInteger7, bigInteger5);
        zzZ33 zzz332 = new zzZ33(zzv2, zzv2.zzY(new BigInteger("1"), new BigInteger("64033881142927202683649881450433473985931760268884941288852745803908878638612")), bigInteger7, bigInteger5);
        zzZDA zzzda2 = zzZAE.zzWEC;
        hashtable2.put(zzzda2, zzz332);
        BigInteger bigInteger8 = new BigInteger("57896044618658097711785492504343953926634992332820282019728792003956564823193");
        BigInteger bigInteger9 = new BigInteger("57896044618658097711785492504343953927102133160255826820068844496087732066703");
        zzYM1.zzV zzv3 = new zzYM1.zzV(bigInteger8, new BigInteger("57896044618658097711785492504343953926634992332820282019728792003956564823190"), new BigInteger("28091019353058090096996979000309560759124368558014865957655842872397301267595"), bigInteger9, bigInteger5);
        zzZ33 zzz333 = new zzZ33(zzv3, zzv3.zzY(new BigInteger("1"), new BigInteger("28792665814854611296992347458380284135028636778229113005756334730996303888124")), bigInteger9, bigInteger5);
        zzZDA zzzda3 = zzZAE.zzWEE;
        hashtable2.put(zzzda3, zzz333);
        BigInteger bigInteger10 = new BigInteger("70390085352083305199547718019018437841079516630045180471284346843705633502619");
        BigInteger bigInteger11 = new BigInteger("70390085352083305199547718019018437840920882647164081035322601458352298396601");
        zzYM1.zzV zzv4 = new zzYM1.zzV(bigInteger10, new BigInteger("70390085352083305199547718019018437841079516630045180471284346843705633502616"), new BigInteger("32858"), bigInteger11, bigInteger5);
        zzZ33 zzz334 = new zzZ33(zzv4, zzv4.zzY(new BigInteger("0"), new BigInteger("29818893917731240733471273240314769927240550812383695689146495261604565990247")), bigInteger11, bigInteger5);
        zzZDA zzzda4 = zzZAE.zzWEB;
        hashtable2.put(zzzda4, zzz334);
        BigInteger bigInteger12 = new BigInteger("70390085352083305199547718019018437841079516630045180471284346843705633502619");
        BigInteger bigInteger13 = new BigInteger("70390085352083305199547718019018437840920882647164081035322601458352298396601");
        zzYM1.zzV zzv5 = new zzYM1.zzV(bigInteger12, new BigInteger("70390085352083305199547718019018437841079516630045180471284346843705633502616"), new BigInteger("32858"), bigInteger13, bigInteger5);
        zzZ33 zzz335 = new zzZ33(zzv5, zzv5.zzY(new BigInteger("0"), new BigInteger("29818893917731240733471273240314769927240550812383695689146495261604565990247")), bigInteger13, bigInteger5);
        zzZDA zzzda5 = zzZAE.zzWED;
        hashtable2.put(zzzda5, zzz335);
        hashtable.put("GostR3410-2001-CryptoPro-A", zzzda);
        hashtable.put("GostR3410-2001-CryptoPro-B", zzzda3);
        hashtable.put("GostR3410-2001-CryptoPro-C", zzzda5);
        hashtable.put("GostR3410-2001-CryptoPro-XchA", zzzda2);
        hashtable.put("GostR3410-2001-CryptoPro-XchB", zzzda4);
        hashtable3.put(zzzda, "GostR3410-2001-CryptoPro-A");
        hashtable3.put(zzzda3, "GostR3410-2001-CryptoPro-B");
        hashtable3.put(zzzda5, "GostR3410-2001-CryptoPro-C");
        hashtable3.put(zzzda2, "GostR3410-2001-CryptoPro-XchA");
        hashtable3.put(zzzda4, "GostR3410-2001-CryptoPro-XchB");
    }

    public static zzZ33 zzU(zzZDA zzzda) {
        return (zzZ33) zzWEw.get(zzzda);
    }

    public static Enumeration zzXKn() {
        return zzWHx.keys();
    }

    public static zzZ33 zzwK(String str) {
        zzZDA zzzda = (zzZDA) zzWHx.get(str);
        if (zzzda != null) {
            return (zzZ33) zzWEw.get(zzzda);
        }
        return null;
    }

    public static zzZDA zzwM(String str) {
        return (zzZDA) zzWHx.get(str);
    }
}
