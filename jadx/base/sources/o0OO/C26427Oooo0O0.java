package o0OO;

import com.orion.notein.data.p602db.entity.PdfInfoEntity;
import com.orion.notein.domain.mapper.PdfInfoMapper;
import com.orion.notein.domain.models.note.PdfInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0OOo0Oo.InterfaceC27319Oooo0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0OO.Oooo0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26427Oooo0O0 implements InterfaceC27319Oooo0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO f90750OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Oooo000 f90751OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final PdfInfoMapper f90752OooO0OO;

    public C26427Oooo0O0(AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO, Oooo000 pdfInfoLocalDataSource, PdfInfoMapper mapper) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(pdfInfoLocalDataSource, "pdfInfoLocalDataSource");
        kotlin.jvm.internal.OooOOO0.OooO0oO(mapper, "mapper");
        this.f90750OooO00o = abstractApplicationC26277OooOoOO;
        this.f90751OooO0O0 = pdfInfoLocalDataSource;
        this.f90752OooO0OO = mapper;
    }

    public final Object OooO00o(PdfInfo pdfInfo, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26425Oooo00O(this, pdfInfo, str, null), abstractC32479OooO0OO);
        return objOooO0o == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o : C32460OooOooO.f116667OooO00o;
    }

    public final Object OooO0O0(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        Oooo000 oooo000 = this.f90751OooO0O0;
        oooo000.getClass();
        Object objOooO0oO = oooo000.f90741OooO00o.OooO0oO(str2, new C26423OooOooo(new C26421OooOoo0(str, null), null));
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO0oO != enumC32485OooO00o) {
            objOooO0oO = C32460OooOooO.f116667OooO00o;
        }
        return objOooO0oO == enumC32485OooO00o ? objOooO0oO : C32460OooOooO.f116667OooO00o;
    }

    public final Object OooO0OO(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        return C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26426Oooo00o(this, str, str2, null), abstractC32479OooO0OO);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooO0Oo(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        Oooo0 oooo0;
        C26427Oooo0O0 c26427Oooo0O0;
        if (abstractC32479OooO0OO instanceof Oooo0) {
            oooo0 = (Oooo0) abstractC32479OooO0OO;
            int i = oooo0.f90739OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooo0.f90739OooOoO = i - Integer.MIN_VALUE;
            } else {
                oooo0 = new Oooo0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0oO = oooo0.f90737OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooo0.f90739OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0oO);
            oooo0.f90738OooOo0o = this;
            oooo0.f90739OooOoO = 1;
            Oooo000 oooo000 = this.f90751OooO0O0;
            oooo000.getClass();
            objOooO0oO = oooo000.f90741OooO00o.OooO0oO(str, new C26423OooOooo(new C26422OooOooO(2, null), null));
            if (objOooO0oO == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c26427Oooo0O0 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c26427Oooo0O0 = oooo0.f90738OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0oO);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((Iterable) objOooO0oO).iterator();
        while (it.hasNext()) {
            PdfInfo pdfInfo = c26427Oooo0O0.f90752OooO0OO.toPdfInfo((PdfInfoEntity) it.next());
            if (pdfInfo != null) {
                arrayList.add(pdfInfo);
            }
        }
        return arrayList;
    }
}
