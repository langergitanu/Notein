package com.aspose.slides.internal.p407st;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Oooo0;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import com.huawei.hms.support.api.entity.auth.AuthCode;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.zn */
/* JADX INFO: loaded from: classes4.dex */
public class C10755zn extends AbstractC10571o4 {

    /* JADX INFO: renamed from: k4 */
    private final List<C10734yl> f37583k4 = new List<>();

    public C10755zn() {
        m51409um().m51917k4(AuthCode.StatusCode.AUTH_INFO_NOT_EXIST);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        if (this.f37583k4.size() <= 0) {
            return 0;
        }
        long jM52077k4 = ((this.f37583k4.get_Item(0).m52077k4() & 4294967295L) - 1) & 4294967295L;
        List.Enumerator<C10734yl> it = this.f37583k4.iterator();
        int i = 0;
        int iOooO00o = 0;
        while (it.hasNext()) {
            try {
                long jM52077k42 = it.next().m52077k4();
                if ((jM52077k42 & 4294967295L) > (((jM52077k4 & 4294967295L) + 1) & 4294967295L) && i > 0) {
                    iOooO00o = Oooo0.OooO00o(i, 1, 4, iOooO00o);
                    i = 0;
                }
                i++;
                jM52077k4 = jM52077k42;
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return i > 0 ? Oooo0.OooO00o(i, 1, 4, iOooO00o) : iOooO00o;
    }

    /* JADX INFO: renamed from: x1 */
    public final List<C10734yl> m52164x1() {
        return this.f37583k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final long m52162k4(List<AbstractC10571o4> list) {
        this.f37583k4.clear();
        long jMo51092dy = 0;
        long jMo50440k4 = 0;
        for (int i = 0; i < list.size(); i++) {
            if ((list.get_Item(i).m51404bv() & 65535) != 6002 && (list.get_Item(i).m51404bv() & 65535) != 4085) {
                jMo51092dy = ((InterfaceC10673uw) list.get_Item(i)).mo51092dy();
                this.f37583k4.addItem(new C10734yl(jMo51092dy, jMo50440k4));
                jMo50440k4 = ((jMo50440k4 & 4294967295L) + (((long) (list.get_Item(i).mo50440k4() + 8)) & 4294967295L)) & 4294967295L;
            }
        }
        return jMo51092dy;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m52165x1(long j) {
        for (int i = 0; i < this.f37583k4.size(); i++) {
            if (this.f37583k4.get_Item(i).m52077k4() == j) {
                this.f37583k4.removeAt(i);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C10734yl m52163k4(long j) {
        List.Enumerator<C10734yl> it = this.f37583k4.iterator();
        while (it.hasNext()) {
            try {
                C10734yl next = it.next();
                if (next.m52077k4() == j) {
                    return next;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            return null;
        }
        it.dispose();
        return null;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        int i = 0;
        while (i < m51409um().m51914du()) {
            long jM13384uz = c3134k4.m13384uz();
            long j = 4294967295L & jM13384uz;
            long j2 = jM13384uz & 1048575;
            int i2 = (int) (j >> 20);
            i += 4;
            int i3 = 0;
            while (i3 < i2 && i < m51409um().m51914du()) {
                this.f37583k4.addItem(new C10734yl(j2, c3134k4.m13384uz()));
                i += 4;
                i3++;
                j2++;
            }
        }
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        long j;
        if (this.f37583k4.size() > 0) {
            long j2 = 4294967295L;
            long jM52077k4 = ((this.f37583k4.get_Item(0).m52077k4() & 4294967295L) - 1) & 4294967295L;
            List list = new List();
            List.Enumerator<C10734yl> it = this.f37583k4.iterator();
            while (it.hasNext()) {
                try {
                    C10734yl next = it.next();
                    long jM52077k42 = next.m52077k4();
                    long j3 = jM52077k4 & j2;
                    if ((jM52077k42 & j2) <= ((j3 + 1) & j2) || list.size() <= 0) {
                        j = j2;
                    } else {
                        j = j2;
                        c3149x1.m13447k4(((((long) (list.size() << 20)) & j2) | ((((j3 - ((long) list.size())) & j) + 1) & j)) & j);
                        for (int i = 0; i < list.size(); i++) {
                            c3149x1.m13447k4(((Long) list.get_Item(i)).longValue());
                        }
                        list.clear();
                    }
                    list.addItem(Long.valueOf(next.m52079x1()));
                    jM52077k4 = jM52077k42;
                    j2 = j;
                } catch (Throwable th) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    throw th;
                }
            }
            long j4 = j2;
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
            if (list.size() > 0) {
                c3149x1.m13447k4(((((((jM52077k4 & j4) - ((long) list.size())) & j4) + 1) & j4) | (((long) (list.size() << 20)) & j4)) & j4);
                List.Enumerator it2 = list.iterator();
                while (it2.hasNext()) {
                    try {
                        c3149x1.m13447k4(((Long) C7019kk.m27464to(it2.next(), Long.TYPE)).longValue());
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                            it2.dispose();
                        }
                    }
                }
            }
        }
    }
}
