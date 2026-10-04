package com.aspose.slides.internal.p541z6;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p164hc.C4516h4;
import com.aspose.slides.internal.p164hc.C4517k4;
import com.aspose.slides.internal.p164hc.C4519to;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p482wr.C12262lr;
import com.aspose.slides.p559ms.System.AbstractC14085qw;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.z6.x1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13452x1 implements IDisposable {

    /* JADX INFO: renamed from: k4 */
    public static final C13452x1 f45039k4 = new C13452x1(C13450to.f45032k4);

    /* JADX INFO: renamed from: x1 */
    private final C13450to f45043x1;

    /* JADX INFO: renamed from: kk */
    private final IGenericDictionary<C12262lr, C4516h4> f45041kk = new Dictionary();

    /* JADX INFO: renamed from: to */
    private final IGenericDictionary<AbstractC3150x6, InterfaceC13443dy> f45042to = new Dictionary();

    /* JADX INFO: renamed from: du */
    private final IGenericDictionary<AbstractC3150x6, InterfaceC13443dy> f45040du = new Dictionary();

    /* JADX INFO: renamed from: com.aspose.slides.internal.z6.x1$k4 */
    public static abstract class k4 extends AbstractC14085qw {
        /* JADX INFO: renamed from: k4 */
        public abstract boolean mo62584k4(InterfaceC13443dy interfaceC13443dy, long j);
    }

    public C13452x1() {
        C13448kk c13448kk = new C13448kk();
        this.f45043x1 = new C13450to(c13448kk, new C13445h4(c13448kk, new C13442du()));
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        IGenericEnumerator<KeyValuePair<TKey, TValue>> it = this.f45041kk.iterator();
        while (it.hasNext()) {
            try {
                ((C4516h4) ((KeyValuePair) it.next()).getValue()).dispose();
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        IGenericEnumerator<KeyValuePair<TKey, TValue>> it2 = this.f45042to.iterator();
        while (it2.hasNext()) {
            try {
                ((InterfaceC13443dy) ((KeyValuePair) it2.next()).getValue()).dispose();
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
            it2.dispose();
        }
        it = this.f45040du.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair keyValuePair = (KeyValuePair) it.next();
                ((AbstractC3150x6) keyValuePair.getKey()).dispose();
                ((InterfaceC13443dy) keyValuePair.getValue()).dispose();
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        this.f45043x1.m62566k4().dispose();
    }

    /* JADX INFO: renamed from: k4 */
    public final InterfaceC13441ck m62575k4() {
        return this.f45043x1.m62566k4();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m62583x1() {
        IGenericEnumerator<KeyValuePair<TKey, TValue>> it = this.f45041kk.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair keyValuePair = (KeyValuePair) it.next();
                if (((C4516h4) keyValuePair.getValue()).m18617to()) {
                    ((C4516h4) keyValuePair.getValue()).m18616du();
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    public C13452x1(C13450to c13450to) {
        if (c13450to == null) {
            throw new ArgumentNullException("options");
        }
        this.f45043x1 = c13450to;
    }

    /* JADX INFO: renamed from: k4 */
    public final InterfaceC13443dy m62576k4(AbstractC3150x6 abstractC3150x6) {
        return m62577k4(abstractC3150x6, false);
    }

    /* JADX INFO: renamed from: k4 */
    public final InterfaceC13443dy m62577k4(AbstractC3150x6 abstractC3150x6, boolean z) {
        return m62578k4(abstractC3150x6, z, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC13443dy m62578k4(AbstractC3150x6 abstractC3150x6, boolean z, boolean z2) {
        InterfaceC13443dy interfaceC13443dy;
        if (this.f45042to.containsKey(abstractC3150x6) || this.f45040du.containsKey(abstractC3150x6)) {
            throw new ArgumentException("Already registered", "stream");
        }
        if (abstractC3150x6.canSeek()) {
            C4519to c4519to = new C4519to(abstractC3150x6);
            interfaceC13443dy = c4519to;
            if (z) {
                this.f45043x1.m62569kk().mo62543x1("Attempt to lazy load seekable stream");
                interfaceC13443dy = c4519to;
            }
        } else {
            C4517k4 c4517k4 = new C4517k4(abstractC3150x6, this.f45043x1, new k4() { // from class: com.aspose.slides.internal.z6.x1.2
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return "Aspose.Foundation.Blob.BlobManager.CanDownloadInMemoryHandler(Aspose.Foundation.Blob.IBlobHandler,ulong)";
                }

                @Override // com.aspose.slides.internal.p541z6.C13452x1.k4
                /* JADX INFO: renamed from: k4 */
                public boolean mo62584k4(InterfaceC13443dy interfaceC13443dy2, long j) {
                    return C13452x1.this.m62573k4(interfaceC13443dy2, j);
                }
            });
            if (z) {
                interfaceC13443dy = c4517k4;
                if (this.f45043x1.m62565h4()) {
                    c4517k4.m18620to();
                    interfaceC13443dy = c4517k4;
                }
            }
        }
        (z2 ? this.f45040du : this.f45042to).addItem(abstractC3150x6, interfaceC13443dy);
        return interfaceC13443dy;
    }

    /* JADX INFO: renamed from: k4 */
    public final InterfaceC13443dy m62579k4(C12262lr c12262lr) {
        return m62580k4(c12262lr, false);
    }

    /* JADX INFO: renamed from: k4 */
    public final InterfaceC13443dy m62580k4(C12262lr c12262lr, boolean z) {
        if (this.f45041kk.containsKey(c12262lr)) {
            throw new ArgumentException("Already registered", "zipEntry");
        }
        C4516h4 c4516h4 = new C4516h4(c12262lr, this.f45043x1, new k4() { // from class: com.aspose.slides.internal.z6.x1.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Foundation.Blob.BlobManager.CanDownloadInMemoryHandler(Aspose.Foundation.Blob.IBlobHandler,ulong)";
            }

            @Override // com.aspose.slides.internal.p541z6.C13452x1.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo62584k4(InterfaceC13443dy interfaceC13443dy, long j) {
                return C13452x1.this.m62573k4(interfaceC13443dy, j);
            }
        });
        this.f45041kk.addItem(c12262lr, c4516h4);
        if (z && !this.f45043x1.m62565h4()) {
            return c4516h4;
        }
        c4516h4.m18616du();
        return c4516h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final InterfaceC13443dy m62581k4(byte[] bArr) {
        return C13449m9.m62563k4(bArr);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62582k4(InterfaceC13443dy interfaceC13443dy) {
        boolean zM27456k4;
        IGenericEnumerator<KeyValuePair<TKey, TValue>> it = this.f45041kk.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair keyValuePair = (KeyValuePair) it.next();
                if (interfaceC13443dy == keyValuePair.getValue()) {
                    ((C4516h4) keyValuePair.getValue()).dispose();
                    this.f45041kk.removeItemByKey((C12262lr) keyValuePair.getKey());
                    if (zM27456k4) {
                        return;
                    } else {
                        return;
                    }
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        IGenericEnumerator<KeyValuePair<TKey, TValue>> it2 = this.f45042to.iterator();
        while (it2.hasNext()) {
            try {
                KeyValuePair keyValuePair2 = (KeyValuePair) it2.next();
                if (interfaceC13443dy == keyValuePair2.getValue()) {
                    ((InterfaceC13443dy) keyValuePair2.getValue()).dispose();
                    this.f45042to.removeItemByKey((AbstractC3150x6) keyValuePair2.getKey());
                    if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                        it2.dispose();
                        return;
                    }
                    return;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
            it2.dispose();
        }
        IGenericEnumerator<KeyValuePair<TKey, TValue>> it3 = this.f45040du.iterator();
        while (it3.hasNext()) {
            try {
                KeyValuePair keyValuePair3 = (KeyValuePair) it3.next();
                if (interfaceC13443dy == keyValuePair3.getValue()) {
                    ((AbstractC3150x6) keyValuePair3.getKey()).dispose();
                    ((InterfaceC13443dy) keyValuePair3.getValue()).dispose();
                    this.f45040du.removeItemByKey((AbstractC3150x6) keyValuePair3.getKey());
                    if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                        it3.dispose();
                        return;
                    }
                    return;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                    it3.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
            it3.dispose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public boolean m62573k4(InterfaceC13443dy interfaceC13443dy, long j) {
        IGenericEnumerator<InterfaceC13443dy> it = this.f45042to.getValues().iterator();
        long jMo18612kk = 0;
        while (it.hasNext()) {
            try {
                jMo18612kk += it.next().mo18612kk();
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        IGenericEnumerator<C4516h4> it2 = this.f45040du.getValues().iterator();
        while (it2.hasNext()) {
            try {
                jMo18612kk += it2.next().mo18612kk();
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
            it2.dispose();
        }
        it2 = this.f45041kk.getValues().iterator();
        while (it2.hasNext()) {
            try {
                jMo18612kk += it2.next().mo18612kk();
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
            it2.dispose();
        }
        return this.f45043x1.m62564du() >= jMo18612kk + j;
    }
}
