package oO0O0OOo;

import androidx.fragment.app.C21904OooOoo0;
import java.io.IOException;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.ClosedSelectorException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.spi.AbstractSelector;
import java.nio.channels.spi.SelectorProvider;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O0OOo.C32654OooO0O0;
import oO0o0OO.C33614OooOOO0;
import oO0o0OO.InterfaceC33611OooOO0O;

/* JADX INFO: loaded from: classes10.dex */
public abstract class OooOOO implements OooOOO0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f117378OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final SelectorProvider f117379OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f117380OooOoO0;

    public static final class OooO00o extends CancellationException {
    }

    public OooOOO() {
        SelectorProvider selectorProviderProvider = SelectorProvider.provider();
        kotlin.jvm.internal.OooOOO0.OooO0o(selectorProviderProvider, "provider()");
        this.f117379OooOo0o = selectorProviderProvider;
    }

    public static void OooOOo0(AbstractSelector selector, Throwable th) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(selector, "selector");
        if (th == null) {
            th = new OooO00o("Closed selector");
        }
        Set<SelectionKey> setKeys = selector.keys();
        kotlin.jvm.internal.OooOOO0.OooO0o(setKeys, "selector.keys()");
        for (SelectionKey selectionKey : setKeys) {
            try {
                if (selectionKey.isValid()) {
                    selectionKey.interestOps(0);
                }
            } catch (CancelledKeyException unused) {
            }
            Object objAttachment = selectionKey.attachment();
            OooOO0O oooOO0O = objAttachment instanceof OooOO0O ? (OooOO0O) objAttachment : null;
            if (oooOO0O != null) {
                OooOOoo(oooOO0O, th);
            }
            selectionKey.cancel();
        }
    }

    public static void OooOOoo(OooOO0O attachment, Throwable th) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(attachment, "attachment");
        C32659OooO0oO c32659OooO0oOO000OOo = attachment.o000OOo();
        for (OooOO0 interest : OooOO0.f117367OooOo) {
            c32659OooO0oOO000OOo.getClass();
            kotlin.jvm.internal.OooOOO0.OooO0oO(interest, "interest");
            InterfaceC33611OooOO0O<C32460OooOooO> andSet = C32659OooO0oO.f117361OooO00o[interest.ordinal()].getAndSet(c32659OooO0oOO000OOo, null);
            if (andSet != null) {
                andSet.resumeWith(C32446OooOOOo.OooO00o(th));
            }
        }
    }

    public final void OooO00o(Selector selector, OooOO0O oooOO0O) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(selector, "selector");
        try {
            SelectableChannel channel = oooOO0O.getChannel();
            SelectionKey selectionKeyKeyFor = channel.keyFor(selector);
            int iO00000o0 = oooOO0O.o00000o0();
            if (selectionKeyKeyFor == null) {
                if (iO00000o0 != 0) {
                    channel.register(selector, iO00000o0, oooOO0O);
                }
            } else if (selectionKeyKeyFor.interestOps() != iO00000o0) {
                selectionKeyKeyFor.interestOps(iO00000o0);
            }
            if (iO00000o0 != 0) {
                this.f117378OooOo++;
            }
        } catch (Throwable th) {
            SelectionKey selectionKeyKeyFor2 = oooOO0O.getChannel().keyFor(selector);
            if (selectionKeyKeyFor2 != null) {
                selectionKeyKeyFor2.cancel();
            }
            OooOOoo(oooOO0O, th);
        }
    }

    public final void OooOooo(Set<SelectionKey> set, Set<? extends SelectionKey> set2) {
        int size = set.size();
        this.f117378OooOo = set2.size() - size;
        this.f117380OooOoO0 = 0;
        if (size > 0) {
            Iterator<SelectionKey> it = set.iterator();
            while (it.hasNext()) {
                SelectionKey key = it.next();
                kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
                try {
                    int i = key.readyOps();
                    int iInterestOps = key.interestOps();
                    Object objAttachment = key.attachment();
                    OooOO0O oooOO0O = objAttachment instanceof OooOO0O ? (OooOO0O) objAttachment : null;
                    if (oooOO0O == null) {
                        key.cancel();
                        this.f117380OooOoO0++;
                    } else {
                        C32659OooO0oO c32659OooO0oOO000OOo = oooOO0O.o000OOo();
                        int[] iArr = OooOO0.f117369OooOoO0;
                        int length = iArr.length;
                        for (int i2 = 0; i2 < length; i2++) {
                            if ((iArr[i2] & i) != 0) {
                                c32659OooO0oOO000OOo.getClass();
                                InterfaceC33611OooOO0O<C32460OooOooO> andSet = C32659OooO0oO.f117361OooO00o[i2].getAndSet(c32659OooO0oOO000OOo, null);
                                if (andSet != null) {
                                    andSet.resumeWith(C32460OooOooO.f116667OooO00o);
                                }
                            }
                        }
                        int i3 = (~i) & iInterestOps;
                        if (i3 != iInterestOps) {
                            key.interestOps(i3);
                        }
                        if (i3 != 0) {
                            this.f117378OooOo++;
                        }
                    }
                } catch (Throwable th) {
                    key.cancel();
                    this.f117380OooOoO0++;
                    Object objAttachment2 = key.attachment();
                    OooOO0O oooOO0O2 = objAttachment2 instanceof OooOO0O ? (OooOO0O) objAttachment2 : null;
                    if (oooOO0O2 != null) {
                        OooOOoo(oooOO0O2, th);
                        key.attach(null);
                    }
                }
                it.remove();
            }
        }
    }

    @Override // oO0O0OOo.OooOOO0
    public final Object o000Oo0(OooOO0O oooOO0O, OooOO0 oooOO02, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        int iO00000o0 = oooOO0O.o00000o0();
        if (oooOO0O.isClosed()) {
            throw new IOException("Selectable is already closed");
        }
        int i = oooOO02.f117373OooOo0o;
        if ((iO00000o0 & i) == 0) {
            throw new IllegalStateException(("Selectable is invalid state: " + iO00000o0 + ", " + i).toString());
        }
        C33614OooOOO0 c33614OooOOO0 = new C33614OooOOO0(1, C21904OooOoo0.OooO0o0(abstractC32479OooO0OO));
        c33614OooOOO0.OooOOoo();
        c33614OooOOO0.OooOo0(OooOOOO.f117381OooOo0o);
        C32659OooO0oO c32659OooO0oOO000OOo = oooOO0O.o000OOo();
        c32659OooO0oOO000OOo.getClass();
        AtomicReferenceFieldUpdater<C32659OooO0oO, InterfaceC33611OooOO0O<C32460OooOooO>> atomicReferenceFieldUpdater = C32659OooO0oO.f117361OooO00o[oooOO02.ordinal()];
        while (!atomicReferenceFieldUpdater.compareAndSet(c32659OooO0oOO000OOo, null, c33614OooOOO0)) {
            if (atomicReferenceFieldUpdater.get(c32659OooO0oOO000OOo) != null) {
                throw new IllegalStateException("Handler for " + oooOO02.name() + " is already registered");
            }
        }
        if (!c33614OooOOO0.OooOo()) {
            C32654OooO0O0 c32654OooO0O0 = (C32654OooO0O0) this;
            try {
                if (!c32654OooO0O0.f117343OooOoo0.OooO00o(oooOO0O)) {
                    if (oooOO0O.getChannel().isOpen()) {
                        throw new ClosedSelectorException();
                    }
                    throw new ClosedChannelException();
                }
                C32654OooO0O0.OooO00o<C32460OooOooO, Continuation<C32460OooOooO>> oooO00o = c32654OooO0O0.f117341OooOoOO;
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                Continuation continuation = (Continuation) oooO00o.f117344OooO00o.getAndSet(null);
                if (continuation != null) {
                    continuation.resumeWith(c32460OooOooO);
                }
                c32654OooO0O0.o0Oo0oo();
            } catch (Throwable th) {
                OooOOoo(oooOO0O, th);
            }
        }
        Object objOooOOo = c33614OooOOO0.OooOOo();
        return objOooOOo == EnumC32485OooO00o.f116726OooOo0o ? objOooOOo : C32460OooOooO.f116667OooO00o;
    }
}
