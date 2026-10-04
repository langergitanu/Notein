package oO0oO00;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.InterfaceC33911OooO0OO;

/* JADX INFO: renamed from: oO0oO00.Oooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33967Oooo0o<K, V> extends AbstractC33986Oooooo<K, V, Map<K, ? extends V>, HashMap<K, V>> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C33968Oooo0o0 f122191OooO0OO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33967Oooo0o(InterfaceC33911OooO0OO<K> kSerializer, InterfaceC33911OooO0OO<V> vSerializer) {
        super(kSerializer, vSerializer);
        kotlin.jvm.internal.OooOOO0.OooO0oO(kSerializer, "kSerializer");
        kotlin.jvm.internal.OooOOO0.OooO0oO(vSerializer, "vSerializer");
        InterfaceC33531OooO0o0 keyDesc = kSerializer.getDescriptor();
        InterfaceC33531OooO0o0 valueDesc = vSerializer.getDescriptor();
        kotlin.jvm.internal.OooOOO0.OooO0oO(keyDesc, "keyDesc");
        kotlin.jvm.internal.OooOOO0.OooO0oO(valueDesc, "valueDesc");
        this.f122191OooO0OO = new C33968Oooo0o0("kotlin.collections.HashMap", keyDesc, valueDesc);
    }

    @Override // oO0oO00.AbstractC33933OooO00o
    public final Object OooO00o() {
        return new HashMap();
    }

    @Override // oO0oO00.AbstractC33933OooO00o
    public final int OooO0O0(Object obj) {
        HashMap map = (HashMap) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(map, "<this>");
        return map.size() * 2;
    }

    @Override // oO0oO00.AbstractC33933OooO00o
    public final Iterator OooO0OO(Object obj) {
        Map map = (Map) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(map, "<this>");
        return map.entrySet().iterator();
    }

    @Override // oO0oO00.AbstractC33933OooO00o
    public final int OooO0Oo(Object obj) {
        Map map = (Map) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(map, "<this>");
        return map.size();
    }

    @Override // oO0oO00.AbstractC33933OooO00o
    public final Object OooO0oO(Object obj) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(null, "<this>");
        return new HashMap((Map) null);
    }

    @Override // oO0oO00.AbstractC33933OooO00o
    public final Object OooO0oo(Object obj) {
        HashMap map = (HashMap) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(map, "<this>");
        return map;
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO, oO0o0ooO.InterfaceC33910OooO0O0
    public final InterfaceC33531OooO0o0 getDescriptor() {
        return this.f122191OooO0OO;
    }
}
