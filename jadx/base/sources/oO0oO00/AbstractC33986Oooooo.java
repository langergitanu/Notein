package oO0oO00;

import Oooo0.C20855OooooOO;
import java.util.Iterator;
import java.util.Map;
import oO0o.AbstractC33526OooO0Oo;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO000.InterfaceC34004OooO0Oo;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: renamed from: oO0oO00.Oooooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC33986Oooooo<Key, Value, Collection, Builder extends Map<Key, Value>> extends AbstractC33933OooO00o<Map.Entry<? extends Key, ? extends Value>, Collection, Builder> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC33911OooO0OO<Key> f122214OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC33911OooO0OO<Value> f122215OooO0O0;

    public AbstractC33986Oooooo(InterfaceC33911OooO0OO interfaceC33911OooO0OO, InterfaceC33911OooO0OO interfaceC33911OooO0OO2) {
        this.f122214OooO00o = interfaceC33911OooO0OO;
        this.f122215OooO0O0 = interfaceC33911OooO0OO2;
    }

    @Override // oO0oO00.AbstractC33933OooO00o
    public final void OooO0o(oO0oO000.OooO00o oooO00o, int i, Object obj) {
        Map builder = (Map) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(builder, "builder");
        Object objOooOOO0 = oooO00o.OooOOO0(getDescriptor(), i, this.f122214OooO00o, null);
        int iOooOo0o = oooO00o.OooOo0o(getDescriptor());
        if (iOooOo0o != i + 1) {
            throw new IllegalArgumentException(C20855OooooOO.OooO0OO(i, iOooOo0o, "Value must follow key in a map, index for key: ", ", returned index for value: ").toString());
        }
        boolean zContainsKey = builder.containsKey(objOooOOO0);
        InterfaceC33911OooO0OO<Value> interfaceC33911OooO0OO = this.f122215OooO0O0;
        builder.put(objOooOOO0, (!zContainsKey || (interfaceC33911OooO0OO.getDescriptor().getKind() instanceof AbstractC33526OooO0Oo)) ? oooO00o.OooOOO0(getDescriptor(), iOooOo0o, interfaceC33911OooO0OO, null) : oooO00o.OooOOO0(getDescriptor(), iOooOo0o, interfaceC33911OooO0OO, C34444Oooo0O0.OooO0oO(objOooOOO0, builder)));
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO
    public final void serialize(InterfaceC34004OooO0Oo encoder, Collection collection) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(encoder, "encoder");
        OooO0Oo(collection);
        InterfaceC33531OooO0o0 descriptor = getDescriptor();
        oO0oO000.OooO0O0 oooO0O0OooO = encoder.OooO(descriptor);
        Iterator<Map.Entry<? extends Key, ? extends Value>> itOooO0OO = OooO0OO(collection);
        int i = 0;
        while (itOooO0OO.hasNext()) {
            Map.Entry<? extends Key, ? extends Value> next = itOooO0OO.next();
            Key key = next.getKey();
            Value value = next.getValue();
            int i2 = i + 1;
            oooO0O0OooO.OooOoo0(getDescriptor(), i, this.f122214OooO00o, key);
            i += 2;
            oooO0O0OooO.OooOoo0(getDescriptor(), i2, this.f122215OooO0O0, value);
        }
        oooO0O0OooO.OooO0O0(descriptor);
    }
}
