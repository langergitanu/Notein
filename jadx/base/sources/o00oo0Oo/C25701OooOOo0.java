package o00oo0Oo;

import com.facebook.imagepipeline.producers.C22274OooOoOO;
import com.facebook.imagepipeline.producers.C22298Ooooo00;
import com.facebook.imagepipeline.producers.C22302OooooOo;
import com.facebook.imagepipeline.producers.InterfaceC22291OoooO0O;
import com.orion.notein.p607ui.user.settings.profile.UserAvatarModifyFragment;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import o00o0Ooo.C25432OooOO0;
import o00o0Ooo.InterfaceC25423OooO;
import o00o0o.AbstractC25434OooO00o;
import o00o0oOo.C25461OooO0Oo;
import o00o0oo.AbstractC25464OooO0OO;
import o00o0oo.C25469OooO0oo;
import o00oo.InterfaceC25636OooO0Oo;
import o00oo0O0.C25667OooOO0o;
import o00oo0O0.C25670OooOOOO;
import o00oo0o0.C25724OooO0O0;
import o00ooO.C25732OooO0O0;
import o00ooO00.C25756OooO00o;
import o00ooO00.C25757OooO0O0;
import o00ooO00.InterfaceC25759OooO0Oo;
import o00ooO0o.C25763OooO00o;

/* JADX INFO: renamed from: o00oo0Oo.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25701OooOOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C25722OoooO00 f87703OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C25757OooO0O0 f87704OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C25756OooO00o f87705OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C25670OooOOOO f87706OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final AtomicLong f87707OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C25667OooOO0o f87708OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C25700OooOOo f87709OooO0oO;

    static {
        new CancellationException("Prefetching is not enabled");
        new CancellationException("ImageRequest is null");
        new CancellationException("Modified URL is null");
    }

    public C25701OooOOo0(C25722OoooO00 producerSequenceFactory, Set requestListeners, Set requestListener2s, InterfaceC25423OooO isPrefetchEnabledSupplier, C25670OooOOOO bitmapMemoryCache, C25670OooOOOO encodedMemoryCache, InterfaceC25423OooO diskCachesStoreSupplier, C25667OooOO0o cacheKeyFactory, C22302OooooOo threadHandoffProducerQueue, C25432OooOO0 suppressBitmapPrefetchingSupplier, C25700OooOOo config) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(producerSequenceFactory, "producerSequenceFactory");
        kotlin.jvm.internal.OooOOO0.OooO0oO(requestListeners, "requestListeners");
        kotlin.jvm.internal.OooOOO0.OooO0oO(requestListener2s, "requestListener2s");
        kotlin.jvm.internal.OooOOO0.OooO0oO(isPrefetchEnabledSupplier, "isPrefetchEnabledSupplier");
        kotlin.jvm.internal.OooOOO0.OooO0oO(bitmapMemoryCache, "bitmapMemoryCache");
        kotlin.jvm.internal.OooOOO0.OooO0oO(encodedMemoryCache, "encodedMemoryCache");
        kotlin.jvm.internal.OooOOO0.OooO0oO(diskCachesStoreSupplier, "diskCachesStoreSupplier");
        kotlin.jvm.internal.OooOOO0.OooO0oO(cacheKeyFactory, "cacheKeyFactory");
        kotlin.jvm.internal.OooOOO0.OooO0oO(threadHandoffProducerQueue, "threadHandoffProducerQueue");
        kotlin.jvm.internal.OooOOO0.OooO0oO(suppressBitmapPrefetchingSupplier, "suppressBitmapPrefetchingSupplier");
        kotlin.jvm.internal.OooOOO0.OooO0oO(config, "config");
        this.f87703OooO00o = producerSequenceFactory;
        this.f87704OooO0O0 = new C25757OooO0O0((Set<InterfaceC25759OooO0Oo>) requestListeners);
        this.f87705OooO0OO = new C25756OooO00o(requestListener2s);
        this.f87707OooO0o = new AtomicLong();
        this.f87706OooO0Oo = bitmapMemoryCache;
        this.f87708OooO0o0 = cacheKeyFactory;
        this.f87709OooO0oO = config;
    }

    public final AbstractC25464OooO0OO OooO00o(C25763OooO00o c25763OooO00o, UserAvatarModifyFragment userAvatarModifyFragment, C25763OooO00o.OooO0OO oooO0OO, C25757OooO0O0 c25757OooO0O0, String str) {
        if (c25763OooO00o == null) {
            NullPointerException nullPointerException = new NullPointerException();
            C25469OooO0oo c25469OooO0oo = new C25469OooO0oo();
            c25469OooO0oo.OooO0oo(nullPointerException, null);
            return c25469OooO0oo;
        }
        try {
            C25722OoooO00 c25722OoooO00 = this.f87703OooO00o;
            c25722OoooO00.getClass();
            C25732OooO0O0.OooO00o();
            InterfaceC22291OoooO0O<AbstractC25434OooO00o<InterfaceC25636OooO0Oo>> interfaceC22291OoooO0OOooO0OO = c25722OoooO00.OooO0OO(c25763OooO00o);
            if (oooO0OO == null) {
                oooO0OO = C25763OooO00o.OooO0OO.FULL_FETCH;
            }
            return OooO0O0(interfaceC22291OoooO0OOooO0OO, c25763OooO00o, oooO0OO, userAvatarModifyFragment, c25757OooO0O0, str);
        } catch (Exception e) {
            C25469OooO0oo c25469OooO0oo2 = new C25469OooO0oo();
            c25469OooO0oo2.OooO0oo(e, null);
            return c25469OooO0oo2;
        }
    }

    public final AbstractC25464OooO0OO OooO0O0(InterfaceC22291OoooO0O interfaceC22291OoooO0O, C25763OooO00o c25763OooO00o, C25763OooO00o.OooO0OO oooO0OO, UserAvatarModifyFragment userAvatarModifyFragment, C25757OooO0O0 c25757OooO0O0, String str) {
        C25732OooO0O0.OooO00o();
        if (c25763OooO00o == null) {
            throw new IllegalStateException("Required value was null.");
        }
        C25757OooO0O0 c25757OooO0O02 = this.f87704OooO0O0;
        if (c25757OooO0O0 != null) {
            c25757OooO0O02 = new C25757OooO0O0(c25757OooO0O02, c25757OooO0O0);
        }
        C22274OooOoOO c22274OooOoOO = new C22274OooOoOO(c25757OooO0O02, this.f87705OooO0OO);
        try {
            C25763OooO00o.OooO0OO oooO0OO2 = c25763OooO00o.f87909OooO;
            C22298Ooooo00 c22298Ooooo00 = new C22298Ooooo00(c25763OooO00o, String.valueOf(this.f87707OooO0o.getAndIncrement()), str, c22274OooOoOO, userAvatarModifyFragment, oooO0OO2.f87928OooOo0o > oooO0OO.f87928OooOo0o ? oooO0OO2 : oooO0OO, false, !C25461OooO0Oo.OooO0OO(c25763OooO00o.f87911OooO0O0), c25763OooO00o.f87917OooO0oo, this.f87709OooO0oO);
            C25732OooO0O0.OooO00o();
            C25724OooO0O0 c25724OooO0O0 = new C25724OooO0O0(interfaceC22291OoooO0O, c22298Ooooo00, c22274OooOoOO);
            C25732OooO0O0.OooO00o();
            return c25724OooO0O0;
        } catch (Exception e) {
            C25469OooO0oo c25469OooO0oo = new C25469OooO0oo();
            c25469OooO0oo.OooO0oo(e, null);
            return c25469OooO0oo;
        }
    }
}
