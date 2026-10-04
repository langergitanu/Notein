package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p104ec.C3594ai;
import com.aspose.slides.internal.p104ec.C3633os;
import com.aspose.slides.internal.p104ec.C3637ri;
import com.aspose.slides.internal.p104ec.C3647um;
import com.aspose.slides.internal.p104ec.C3653w6;
import com.aspose.slides.internal.p104ec.C3662y9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class VbaProject implements IVbaProject {

    /* JADX INFO: renamed from: k4 */
    private C3662y9 f3646k4;

    /* JADX INFO: renamed from: kk */
    private VbaReferenceCollection f3647kk;

    /* JADX INFO: renamed from: x1 */
    private VbaModuleCollection f3648x1;

    public VbaProject() {
        m3047k4(new C3662y9(1252, "VBAProject"));
    }

    /* JADX INFO: renamed from: kk */
    private void m3048kk() {
        Dictionary.Enumerator<String, C3647um> it = this.f3646k4.m14858x1().m14758x1().iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                C3647um c3647um = (C3647um) next.getValue();
                if (c3647um.m14812x1().m14861kk().m14694x1()) {
                    this.f3648x1.m3045k4(new VbaModule((String) next.getKey(), c3647um));
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: to */
    private void m3049to() {
        IVbaReference lvdVar;
        List<IVbaReference> listM3056k4;
        if (this.f3646k4.m14858x1().m14754k4().m14711x1() == null) {
            throw new InvalidOperationException();
        }
        List.Enumerator<C3653w6> it = this.f3646k4.m14858x1().m14754k4().m14711x1().m14734k4().iterator();
        while (it.hasNext()) {
            try {
                C3653w6 next = it.next();
                String strM14723x1 = "";
                if (next.m14828k4() != null && next.m14828k4().m14723x1() != null) {
                    strM14723x1 = next.m14828k4().m14723x1();
                }
                if (((C3633os) C7019kk.m27452k4((Object) next.m14831x1(), C3633os.class)) != null) {
                    lvdVar = new vg7(strM14723x1);
                    listM3056k4 = this.f3647kk.m3056k4();
                } else {
                    C3637ri c3637ri = (C3637ri) C7019kk.m27452k4((Object) next.m14831x1(), C3637ri.class);
                    if (c3637ri != null) {
                        lvdVar = new VbaReferenceOleTypeLib(strM14723x1, c3637ri.m14787x1());
                        listM3056k4 = this.f3647kk.m3056k4();
                    } else {
                        if (((C3594ai) C7019kk.m27452k4((Object) next.m14831x1(), C3594ai.class)) == null) {
                            throw new InvalidOperationException("Unknown VBA Project reference type");
                        }
                        lvdVar = new lvd(strM14723x1);
                        listM3056k4 = this.f3647kk.m3056k4();
                    }
                }
                listM3056k4.addItem(lvdVar);
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    @Override // com.aspose.slides.IVbaProject
    public final IVbaModuleCollection getModules() {
        return this.f3648x1;
    }

    @Override // com.aspose.slides.IVbaProject
    public final String getName() {
        return this.f3646k4.m14858x1().m14754k4().m14706k4().m14840x1().m14784x1();
    }

    @Override // com.aspose.slides.IVbaProject
    public final IVbaReferenceCollection getReferences() {
        return this.f3647kk;
    }

    @Override // com.aspose.slides.IVbaProject
    public final boolean isPasswordProtected() {
        return this.f3646k4.m14857kk();
    }

    /* JADX INFO: renamed from: k4 */
    public final VbaModule m3050k4(String str) {
        return new VbaModule(str, this.f3646k4.m14853k4(str));
    }

    @Override // com.aspose.slides.IVbaProject
    public final byte[] toBinary() {
        return this.f3646k4.m14856k4();
    }

    /* JADX INFO: renamed from: x1 */
    public final C3662y9 m3054x1() {
        return this.f3646k4;
    }

    public VbaProject(C3662y9 c3662y9) {
        m3047k4(c3662y9);
    }

    /* JADX INFO: renamed from: k4 */
    public final VbaProject m3051k4() {
        VbaProject vbaProject = new VbaProject();
        vbaProject.f3646k4.m14858x1().m14754k4().m14706k4().m14840x1().m14783k4(getName());
        IGenericEnumerator<IVbaModule> it = getModules().iterator();
        while (it.hasNext()) {
            try {
                vbaProject.f3648x1.m3045k4(((VbaModule) it.next()).m3043k4());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return vbaProject;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m3055x1(String str) {
        this.f3646k4.m14859x1(str);
    }

    public VbaProject(byte[] bArr) {
        m3047k4(new C3662y9(bArr));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3052k4(IVbaReference iVbaReference) {
        VbaReferenceOleTypeLib vbaReferenceOleTypeLib = (VbaReferenceOleTypeLib) C7019kk.m27452k4((Object) iVbaReference, VbaReferenceOleTypeLib.class);
        if (vbaReferenceOleTypeLib == null) {
            throw new NotSupportedException("Only OLE TypeLib references allowed");
        }
        this.f3646k4.m14855k4(vbaReferenceOleTypeLib.getName(), vbaReferenceOleTypeLib.getLibid());
    }

    /* JADX INFO: renamed from: k4 */
    private void m3047k4(C3662y9 c3662y9) {
        if (c3662y9 == null) {
            throw new ArgumentNullException();
        }
        this.f3648x1 = new VbaModuleCollection(this);
        this.f3647kk = new VbaReferenceCollection(this);
        this.f3646k4 = c3662y9;
        m3048kk();
        m3049to();
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m3053k4(VbaProject vbaProject) {
        if (vbaProject != null && C14113y2.m67363du(vbaProject.getName(), getName()) && vbaProject.getModules().size() == getModules().size()) {
            for (int i = 0; i < getModules().size(); i++) {
                if (!((VbaModule) getModules().get_Item(i)).m3044k4((VbaModule) vbaProject.getModules().get_Item(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
