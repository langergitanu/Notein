package oO0oO00;

import OooOoOO.C20519OooO0Oo;
import java.lang.Enum;
import java.util.Arrays;
import oO00ooO.C32447OooOOo;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.C33917OooOO0;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO000.InterfaceC34004OooO0Oo;

/* JADX INFO: renamed from: oO0oO00.Oooo00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33963Oooo00O<T extends Enum<T>> implements InterfaceC33911OooO0OO<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final T[] f122184OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public C33961OooOooo f122185OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C32447OooOOo f122186OooO0OO;

    public C33963Oooo00O(final String str, T[] values) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(values, "values");
        this.f122184OooO00o = values;
        this.f122186OooO0OO = C20519OooO0Oo.OooO0OO(new oO0O000o.OooO00o() { // from class: oO0oO00.Oooo000
            @Override // oO0O000o.OooO00o
            public final Object invoke() {
                C33963Oooo00O c33963Oooo00O = this.f122183OooOo0o;
                C33961OooOooo c33961OooOooo = c33963Oooo00O.f122185OooO0O0;
                if (c33961OooOooo == null) {
                    Enum[] enumArr = c33963Oooo00O.f122184OooO00o;
                    c33961OooOooo = new C33961OooOooo(str, enumArr.length);
                    for (Enum r0 : enumArr) {
                        c33961OooOooo.OooOO0(r0.name(), false);
                    }
                }
                return c33961OooOooo;
            }
        });
    }

    @Override // oO0o0ooO.InterfaceC33910OooO0O0
    public final Object deserialize(oO0oO000.OooO0OO oooO0OO) {
        int iOooo00o = oooO0OO.Oooo00o(getDescriptor());
        T[] tArr = this.f122184OooO00o;
        if (iOooo00o >= 0 && iOooo00o < tArr.length) {
            return tArr[iOooo00o];
        }
        throw new C33917OooOO0(iOooo00o + " is not among valid " + getDescriptor().OooO0oo() + " enum values, values size is " + tArr.length);
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO, oO0o0ooO.InterfaceC33910OooO0O0
    public final InterfaceC33531OooO0o0 getDescriptor() {
        return (InterfaceC33531OooO0o0) this.f122186OooO0OO.getValue();
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO
    public final void serialize(InterfaceC34004OooO0Oo encoder, Object obj) {
        Enum value = (Enum) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(encoder, "encoder");
        kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
        T[] tArr = this.f122184OooO00o;
        int iOooo000 = oOo000Oo.OooOOO.Oooo000(tArr, value);
        if (iOooo000 != -1) {
            encoder.OooOooO(getDescriptor(), iOooo000);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(value);
        sb.append(" is not a valid enum ");
        sb.append(getDescriptor().OooO0oo());
        sb.append(", must be one of ");
        String string = Arrays.toString(tArr);
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "toString(...)");
        sb.append(string);
        throw new C33917OooOO0(sb.toString());
    }

    public final String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().OooO0oo() + '>';
    }
}
