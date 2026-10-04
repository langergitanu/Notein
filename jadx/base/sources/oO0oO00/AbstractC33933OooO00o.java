package oO0oO00;

import java.util.Iterator;
import oO0o0ooO.InterfaceC33911OooO0OO;

/* JADX INFO: renamed from: oO0oO00.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC33933OooO00o<Element, Collection, Builder> implements InterfaceC33911OooO0OO<Collection> {
    public abstract Builder OooO00o();

    public abstract int OooO0O0(Builder builder);

    public abstract Iterator<Element> OooO0OO(Collection collection);

    public abstract int OooO0Oo(Collection collection);

    public abstract void OooO0o(oO0oO000.OooO00o oooO00o, int i, Object obj);

    public final Object OooO0o0(oO0oO000.OooO0OO oooO0OO) {
        Builder builderOooO00o = OooO00o();
        int iOooO0O0 = OooO0O0(builderOooO00o);
        oO0oO000.OooO00o OooO00o2 = oooO0OO.OooO00o(getDescriptor());
        while (true) {
            int iOooOo0o = OooO00o2.OooOo0o(getDescriptor());
            if (iOooOo0o == -1) {
                OooO00o2.OooO0O0(getDescriptor());
                return OooO0oo(builderOooO00o);
            }
            OooO0o(OooO00o2, iOooOo0o + iOooO0O0, builderOooO00o);
        }
    }

    public abstract Builder OooO0oO(Collection collection);

    public abstract Collection OooO0oo(Builder builder);

    @Override // oO0o0ooO.InterfaceC33910OooO0O0
    public Collection deserialize(oO0oO000.OooO0OO oooO0OO) {
        return (Collection) OooO0o0(oooO0OO);
    }
}
