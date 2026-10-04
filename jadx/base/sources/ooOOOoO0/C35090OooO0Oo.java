package ooOOOoO0;

import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: ooOOOoO0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35090OooO0Oo extends OooOOOO implements InterfaceC32507OooOO0o<Map.Entry<? extends String, ? extends Object>, CharSequence> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final C35090OooO0Oo f126063OooOo0o = new C35090OooO0Oo(1);

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final CharSequence invoke(Map.Entry<? extends String, ? extends Object> entry) {
        String string;
        Map.Entry<? extends String, ? extends Object> entry2 = entry;
        OooOOO0.OooO0oO(entry2, "entry");
        String key = entry2.getKey();
        Object value = entry2.getValue();
        if (value instanceof boolean[]) {
            string = Arrays.toString((boolean[]) value);
            OooOOO0.OooO0o(string, "toString(this)");
        } else if (value instanceof char[]) {
            string = Arrays.toString((char[]) value);
            OooOOO0.OooO0o(string, "toString(this)");
        } else if (value instanceof byte[]) {
            string = Arrays.toString((byte[]) value);
            OooOOO0.OooO0o(string, "toString(this)");
        } else if (value instanceof short[]) {
            string = Arrays.toString((short[]) value);
            OooOOO0.OooO0o(string, "toString(this)");
        } else if (value instanceof int[]) {
            string = Arrays.toString((int[]) value);
            OooOOO0.OooO0o(string, "toString(this)");
        } else if (value instanceof float[]) {
            string = Arrays.toString((float[]) value);
            OooOOO0.OooO0o(string, "toString(this)");
        } else if (value instanceof long[]) {
            string = Arrays.toString((long[]) value);
            OooOOO0.OooO0o(string, "toString(this)");
        } else if (value instanceof double[]) {
            string = Arrays.toString((double[]) value);
            OooOOO0.OooO0o(string, "toString(this)");
        } else if (value instanceof Object[]) {
            string = Arrays.toString((Object[]) value);
            OooOOO0.OooO0o(string, "toString(this)");
        } else {
            string = value.toString();
        }
        return key + '=' + string;
    }
}
