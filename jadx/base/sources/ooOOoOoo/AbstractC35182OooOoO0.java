package ooOOoOoo;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import oO0O000o.InterfaceC32507OooOO0o;
import oOoo0.InterfaceC34595OooO0Oo;

/* JADX INFO: renamed from: ooOOoOoo.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC35182OooOoO0<K, V> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ConcurrentHashMap<String, Integer> f126294OooO00o = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final AtomicInteger f126295OooO0O0 = new AtomicInteger(0);

    /* JADX INFO: renamed from: ooOOoOoo.OooOoO0$OooO00o */
    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<String, Integer> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ AbstractC35182OooOoO0<K, V> f126296OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(AbstractC35182OooOoO0<K, V> abstractC35182OooOoO0) {
            super(1);
            this.f126296OooOo0o = abstractC35182OooOoO0;
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final Integer invoke(String str) {
            String it = str;
            kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
            return Integer.valueOf(this.f126296OooOo0o.f126295OooO0O0.getAndIncrement());
        }
    }

    public abstract int OooO00o(ConcurrentHashMap concurrentHashMap, String str, OooO00o oooO00o);

    public final <T extends K> int OooO0O0(InterfaceC34595OooO0Oo<T> kClass) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(kClass, "kClass");
        ConcurrentHashMap<String, Integer> concurrentHashMap = this.f126294OooO00o;
        String strOooO0Oo = kClass.OooO0Oo();
        kotlin.jvm.internal.OooOOO0.OooO0Oo(strOooO0Oo);
        return OooO00o(concurrentHashMap, strOooO0Oo, new OooO00o(this));
    }
}
