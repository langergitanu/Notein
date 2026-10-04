package com.aspose.slides.p559ms.backend.android.System.Drawing;

import android.graphics.Typeface;
import android.util.SparseArray;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p167hh.AbstractC4584k4;
import com.aspose.slides.internal.p167hh.C4582du;
import com.aspose.slides.internal.p167hh.C4583h4;
import com.aspose.slides.internal.p167hh.C4587x1;
import com.aspose.slides.internal.p347px.AbstractC9608yj;
import com.aspose.slides.internal.p347px.C9579bv;
import com.aspose.slides.internal.p347px.C9581ck;
import com.aspose.slides.internal.p347px.C9591ks;
import com.aspose.slides.internal.p347px.C9592lr;
import com.aspose.slides.internal.p466vu.C11875x1;
import com.aspose.slides.internal.p549zg.C13589k4;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.backend.System.Drawing.InterfaceC14121du;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/* JADX INFO: renamed from: com.aspose.slides.ms.backend.android.System.Drawing.kk */
/* JADX INFO: loaded from: classes5.dex */
public class C14134kk implements InterfaceC14121du {

    /* JADX INFO: renamed from: k4 */
    private final C4582du f47404k4 = new C4582du();

    /* JADX INFO: renamed from: x1 */
    private final Map<String, SparseArray<Typeface>> f47406x1 = new HashMap();

    /* JADX INFO: renamed from: kk */
    private final Map<String, C4587x1> f47405kk = new HashMap();

    public C14134kk() throws Throwable {
        m67670k4(new String[]{"/system/fonts"}, false);
    }

    /* JADX INFO: renamed from: k4 */
    public Typeface m67672k4(String str, int i) {
        Typeface typefaceCreate;
        SparseArray<Typeface> sparseArray = this.f47406x1.get(str);
        if (sparseArray == null || sparseArray.size() == 0) {
            typefaceCreate = Typeface.create(str, i);
        } else {
            Typeface typeface = sparseArray.get(i);
            if (typeface != null) {
                return typeface;
            }
            typefaceCreate = Typeface.create(sparseArray.valueAt(0), i);
        }
        m67669k4(str, i, typefaceCreate);
        return typefaceCreate;
    }

    @Override // com.aspose.slides.p559ms.backend.System.Drawing.InterfaceC14121du
    /* JADX INFO: renamed from: x1 */
    public Collection<String> mo67583x1() {
        return this.f47404k4.m18919k4();
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC4584k4 m67662k4(C9579bv c9579bv) {
        return new C13589k4(this.f47404k4, c9579bv);
    }

    /* JADX INFO: renamed from: x1 */
    private void m67671x1(String[] strArr, boolean z) throws Throwable {
        for (String str : strArr) {
            File file = new File(str);
            File[] fileArrListFiles = file.isDirectory() ? file.listFiles() : new File[]{file};
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    String absolutePath = file2.getAbsolutePath();
                    C9581ck c9581ck = new C9581ck(absolutePath);
                    if (z) {
                        mo67580k4(c9581ck);
                    } else {
                        C9591ks[] c9591ksArrM46871k4 = new C9592lr().m46871k4(c9581ck);
                        if (c9591ksArrM46871k4 != null) {
                            for (C9591ks c9591ks : c9591ksArrM46871k4) {
                                if (c9591ks != null && c9591ks.m46846k4() != null) {
                                    m67666k4(m67664k4(c9591ks.m46846k4()), c9591ks, absolutePath);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC4584k4 m67663k4(C9591ks c9591ks, String str) {
        return new C13589k4(this.f47404k4, new C9581ck(str), c9591ks.m46846k4(), c9591ks.m46852x1(), C4583h4.m18921k4(c9591ks.m46852x1()));
    }

    @Override // com.aspose.slides.p559ms.backend.System.Drawing.InterfaceC14121du
    /* JADX INFO: renamed from: k4 */
    public AbstractC4584k4 mo67579k4(String str, String str2, float f, int i) {
        C4587x1 c4587x1 = this.f47405kk.get(str);
        if (c4587x1 == null) {
            throw new ArgumentException(C14113y2.m67402k4("Font {} not found", str));
        }
        AbstractC4584k4 abstractC4584k4M18946k4 = c4587x1.m18946k4(i, false);
        if (abstractC4584k4M18946k4 != null) {
            return abstractC4584k4M18946k4.mo18930k4(f, i);
        }
        throw new ArgumentException(C14113y2.m67402k4("Font {} not found", str));
    }

    /* JADX INFO: renamed from: k4 */
    private C4587x1 m67664k4(String str) {
        C4587x1 c4587x1 = this.f47405kk.get(str);
        if (c4587x1 != null) {
            return c4587x1;
        }
        C4587x1 c4587x12 = new C4587x1(str);
        this.f47405kk.put(str, c4587x12);
        return c4587x12;
    }

    @Override // com.aspose.slides.p559ms.backend.System.Drawing.InterfaceC14121du
    /* JADX INFO: renamed from: k4 */
    public Collection<C4587x1> mo67580k4(AbstractC9608yj abstractC9608yj) throws Throwable {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry<String, Map<Integer, C9579bv>> entry : this.f47404k4.m18920k4(abstractC9608yj).entrySet()) {
            String key = entry.getKey();
            if (key != null) {
                C4587x1 c4587x1M67664k4 = m67664k4(key);
                linkedHashSet.add(c4587x1M67664k4);
                for (C9579bv c9579bv : entry.getValue().values()) {
                    m67665k4(c4587x1M67664k4, c9579bv);
                    m67667k4(abstractC9608yj, c9579bv);
                }
            }
        }
        return linkedHashSet;
    }

    @Override // com.aspose.slides.p559ms.backend.System.Drawing.InterfaceC14121du
    /* JADX INFO: renamed from: k4 */
    public Map<String, C4587x1> mo67581k4() {
        return this.f47405kk;
    }

    /* JADX INFO: renamed from: k4 */
    private void m67665k4(C4587x1 c4587x1, C9579bv c9579bv) {
        c4587x1.m18948k4(m67662k4(c9579bv));
    }

    /* JADX INFO: renamed from: k4 */
    private void m67666k4(C4587x1 c4587x1, C9591ks c9591ks, String str) {
        c4587x1.m18948k4(m67663k4(c9591ks, str));
    }

    /* JADX INFO: renamed from: k4 */
    private void m67667k4(AbstractC9608yj abstractC9608yj, C9579bv c9579bv) throws Throwable {
        File fileCreateTempFile;
        File file;
        FileOutputStream fileOutputStream;
        boolean z = abstractC9608yj instanceof C9581ck;
        if (z) {
            file = new File(((C9581ck) abstractC9608yj).m46810k4());
        } else {
            AbstractC3150x6 abstractC3150x6Mo46753x1 = abstractC9608yj.mo46753x1();
            FileOutputStream fileOutputStream2 = null;
            try {
                try {
                    fileCreateTempFile = File.createTempFile(c9579bv.m46778k4(), ".tmpfont");
                    try {
                        fileOutputStream = new FileOutputStream(fileCreateTempFile);
                    } catch (IOException unused) {
                    }
                } catch (Throwable th) {
                    th = th;
                }
            } catch (IOException unused2) {
                fileCreateTempFile = null;
            }
            try {
                C11875x1.m55456k4(abstractC3150x6Mo46753x1, fileOutputStream);
                abstractC3150x6Mo46753x1.dispose();
                m67668k4(fileOutputStream);
            } catch (IOException unused3) {
                fileOutputStream2 = fileOutputStream;
                abstractC3150x6Mo46753x1.dispose();
                m67668k4(fileOutputStream2);
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream2 = fileOutputStream;
                abstractC3150x6Mo46753x1.dispose();
                m67668k4(fileOutputStream2);
                throw th;
            }
            file = fileCreateTempFile;
        }
        if (file != null) {
            m67669k4(c9579bv.m46778k4(), c9579bv.m46770h4(), Typeface.createFromFile(file));
            if (z) {
                return;
            }
            file.delete();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m67668k4(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m67669k4(String str, int i, Typeface typeface) {
        SparseArray<Typeface> sparseArray = this.f47406x1.get(str);
        if (sparseArray == null) {
            sparseArray = new SparseArray<>(4);
            this.f47406x1.put(str, sparseArray);
        }
        sparseArray.put(i, typeface);
    }

    @Override // com.aspose.slides.p559ms.backend.System.Drawing.InterfaceC14121du
    /* JADX INFO: renamed from: k4 */
    public void mo67582k4(String[] strArr) throws Throwable {
        m67670k4(strArr, true);
    }

    /* JADX INFO: renamed from: k4 */
    private void m67670k4(String[] strArr, boolean z) throws Throwable {
        m67671x1(strArr, z);
    }
}
