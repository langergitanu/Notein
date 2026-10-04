package com.aspose.slides.internal.p036b6;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.b6.sv */
/* JADX INFO: loaded from: classes3.dex */
public class C1646sv {

    /* JADX INFO: renamed from: k4 */
    private static String[] f6327k4 = {"head", "maxp", "cmap", "name", "hhea", "hmtx", "post", "OS/2", "CFF", "GPOS", "kern"};

    /* JADX INFO: renamed from: x1 */
    private C1627f9 f6328x1;

    /* JADX INFO: renamed from: x1 */
    private C1627f9 m8908x1(byte[] bArr) {
        C1636kp c1636kp = new C1636kp(bArr);
        C1627f9 c1627f9 = new C1627f9();
        if (!"OTTO".equals(c1636kp.m8878x1(0L, 4L))) {
            throw new Exception("Not OTF font.");
        }
        c1627f9.m8779k4(c1636kp.m8874to());
        if ((c1627f9.m8788x1() & 65535) <= 0 || (c1627f9.m8788x1() & 65535) > 100) {
            throw new Exception("NumTables is out of range.");
        }
        c1627f9.m8789x1(c1636kp.m8874to());
        c1627f9.m8784kk(c1636kp.m8874to());
        c1627f9.m8787to(c1636kp.m8874to());
        new C1616ar(c1636kp.m8865k4()).mo8703k4(c1636kp, c1627f9);
        if (!c1627f9.m8775h4().containsKey("head") || !c1627f9.m8775h4().containsKey("cmap") || !c1627f9.m8775h4().containsKey("CFF")) {
            throw new Exception("Missing some esseitial tables.");
        }
        for (String str : f6327k4) {
            if (c1627f9.m8775h4().containsKey(str)) {
                c1627f9.m8781k4(str, c1627f9.m8775h4().get_Item(str).mo8703k4(c1636kp, c1627f9));
            }
        }
        return c1627f9;
    }

    /* JADX INFO: renamed from: k4 */
    public final C1627f9 m8910k4(byte[] bArr) {
        this.f6328x1 = m8908x1(bArr);
        m8907k4();
        m8909x1();
        return this.f6328x1;
    }

    /* JADX INFO: renamed from: k4 */
    private void m8907k4() {
        Dictionary<String, Object> dictionaryM8777k4 = this.f6328x1.m8777k4("cmap");
        Dictionary<String, Object> dictionaryM8777k42 = this.f6328x1.m8777k4("hmtx");
        Dictionary.Enumerator<String, Object> it = dictionaryM8777k4.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                this.f6328x1.m8785m9()[(int) ((Long) C7019kk.m27464to(next.getValue(), Long.TYPE)).longValue()].m8764kk().addItem(Integer.valueOf(C14057f9.m66582k4((String) next.getKey())));
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        it = dictionaryM8777k42.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair next2 = it.next();
                int iM66582k4 = C14057f9.m66582k4((String) next2.getKey());
                C1659wy c1659wy = (C1659wy) next2.getValue();
                if ((this.f6328x1.m8785m9()[iM66582k4].m8751c5() & 65535) == 0) {
                    this.f6328x1.m8785m9()[iM66582k4].m8760k4(c1659wy.m9030k4());
                }
                this.f6328x1.m8785m9()[iM66582k4].m8754du(c1659wy.m9031x1());
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m8909x1() {
        this.f6328x1.m8775h4().clear();
    }
}
