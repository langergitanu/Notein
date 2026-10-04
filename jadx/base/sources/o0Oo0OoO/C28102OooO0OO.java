package o0Oo0OoO;

import Oooo0oO.o0Oo0oo;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import com.orion.notein.domain.models.folder.Folder;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o0Oo0OoO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C28102OooO0OO implements InterfaceC32507OooOO0o {
    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        Folder it = (Folder) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
        return o0Oo0oo.OooO0Oo(it.getId(), CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR, it.getTitle());
    }
}
