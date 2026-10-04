package oO0O0OO;

import java.util.ArrayList;
import java.util.Map;
import oO0OooO0.C33479OooO0o;
import oO0o0000.InterfaceC33542OooO0oo;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: renamed from: oO0O0OO.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32617OooOooO<Type extends InterfaceC33542OooO0oo> extends AbstractC32639Ooooo0o<Type> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f117266OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Map<C33479OooO0o, Type> f117267OooO0O0;

    public C32617OooOooO(ArrayList arrayList) {
        this.f117266OooO00o = arrayList;
        Map<C33479OooO0o, Type> mapOooOO0o = C34444Oooo0O0.OooOO0o(arrayList);
        if (mapOooOO0o.size() != arrayList.size()) {
            throw new IllegalArgumentException("Some properties have the same names");
        }
        this.f117267OooO0O0 = mapOooOO0o;
    }

    public final String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + this.f117266OooO00o + ')';
    }
}
