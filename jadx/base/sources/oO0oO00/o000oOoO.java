package oO0oO00;

import androidx.appcompat.widget.C21532OooOOo;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.C33917OooOO0;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO000.InterfaceC34004OooO0Oo;

/* JADX INFO: loaded from: classes10.dex */
public abstract class o000oOoO<K, V, R> implements InterfaceC33911OooO0OO<R> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC33911OooO0OO<K> f122261OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC33911OooO0OO<V> f122262OooO0O0;

    public o000oOoO(InterfaceC33911OooO0OO interfaceC33911OooO0OO, InterfaceC33911OooO0OO interfaceC33911OooO0OO2) {
        this.f122261OooO00o = interfaceC33911OooO0OO;
        this.f122262OooO0O0 = interfaceC33911OooO0OO2;
    }

    public abstract K OooO00o(R r);

    public abstract V OooO0O0(R r);

    public abstract R OooO0OO(K k, V v);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO0o0ooO.InterfaceC33910OooO0O0
    public final R deserialize(oO0oO000.OooO0OO oooO0OO) {
        InterfaceC33531OooO0o0 descriptor = getDescriptor();
        oO0oO000.OooO00o OooO00o2 = oooO0OO.OooO00o(descriptor);
        Object obj = C33992o00000o0.f122236OooO00o;
        Object objOooOOO0 = obj;
        Object objOooOOO02 = objOooOOO0;
        while (true) {
            int iOooOo0o = OooO00o2.OooOo0o(getDescriptor());
            if (iOooOo0o == -1) {
                if (objOooOOO0 == obj) {
                    throw new C33917OooOO0("Element 'key' is missing");
                }
                if (objOooOOO02 == obj) {
                    throw new C33917OooOO0("Element 'value' is missing");
                }
                R r = (R) OooO0OO(objOooOOO0, objOooOOO02);
                OooO00o2.OooO0O0(descriptor);
                return r;
            }
            if (iOooOo0o == 0) {
                objOooOOO0 = OooO00o2.OooOOO0(getDescriptor(), 0, this.f122261OooO00o, null);
            } else {
                if (iOooOo0o != 1) {
                    throw new C33917OooOO0(C21532OooOOo.OooO0OO(iOooOo0o, "Invalid index: "));
                }
                objOooOOO02 = OooO00o2.OooOOO0(getDescriptor(), 1, this.f122262OooO0O0, null);
            }
        }
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO
    public final void serialize(InterfaceC34004OooO0Oo encoder, R r) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(encoder, "encoder");
        oO0oO000.OooO0O0 oooO0O0OooO00o = encoder.OooO00o(getDescriptor());
        oooO0O0OooO00o.OooOoo0(getDescriptor(), 0, this.f122261OooO00o, OooO00o(r));
        oooO0O0OooO00o.OooOoo0(getDescriptor(), 1, this.f122262OooO0O0, OooO0O0(r));
        oooO0O0OooO00o.OooO0O0(getDescriptor());
    }
}
