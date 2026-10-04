package o0o0O0O0;

import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import androidx.core.os.BundleKt;
import com.orion.notein.p607ui.notelist.pdf.ImportBatchPdfDialogFragment;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import o0Oo00oO.C28036OooO0O0;
import o0oOoOo.C31039OooOO0O;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OOO.AbstractC33687OooO0oO;
import oO0o0Ooo.C33833OooOOOO;
import oO0o0o0o.C33874OooO0OO;

/* JADX INFO: renamed from: o0o0O0O0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.pdf.ImportBatchPdfDialogFragment$onConfirmBtnClicked$1", m80623f = "ImportBatchPdfDialogFragment.kt", m80624l = {223}, m80625m = "invokeSuspend")
public final class C30268OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ ImportBatchPdfDialogFragment f107868OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f107869OooOo0o;

    /* JADX INFO: renamed from: o0o0O0O0.OooO0Oo$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.pdf.ImportBatchPdfDialogFragment$onConfirmBtnClicked$1$1", m80623f = "ImportBatchPdfDialogFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ ArrayList f107870OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ ImportBatchPdfDialogFragment f107871OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(ImportBatchPdfDialogFragment importBatchPdfDialogFragment, ArrayList arrayList, Continuation continuation) {
            super(2, continuation);
            this.f107871OooOo0o = importBatchPdfDialogFragment;
            this.f107870OooOo = arrayList;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f107871OooOo0o, this.f107870OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            ImportBatchPdfDialogFragment importBatchPdfDialogFragment = this.f107871OooOo0o;
            String str = importBatchPdfDialogFragment.OooOoo().f107872OooO00o;
            importBatchPdfDialogFragment.getParentFragmentManager().OooooOo(BundleKt.bundleOf(new C32443OooOOO("pdf_uri_list", new ArrayList(this.f107870OooOo))), str);
            C21030OooOO0o.OooO0OO(importBatchPdfDialogFragment).OooOOOo();
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30268OooO0Oo(ImportBatchPdfDialogFragment importBatchPdfDialogFragment, Continuation<? super C30268OooO0Oo> continuation) {
        super(2, continuation);
        this.f107868OooOo = importBatchPdfDialogFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30268OooO0Oo(this.f107868OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30268OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f107869OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            ImportBatchPdfDialogFragment importBatchPdfDialogFragment = this.f107868OooOo;
            Context context = importBatchPdfDialogFragment.getContext();
            if (context == null) {
                return C32460OooOooO.f116667OooO00o;
            }
            Iterable iterable = (Iterable) importBatchPdfDialogFragment.OooOooo().f107904OooOO0O.f121747OooOo0o.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : iterable) {
                if (((C31039OooOO0O) obj2).f110820OooO0o0) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (true) {
                Uri uriForFile = null;
                if (!it.hasNext()) {
                    break;
                }
                try {
                    uriForFile = FileProvider.getUriForFile(context, C28036OooO0O0.OooO0O0(context), new File(((C31039OooOO0O) it.next()).f110816OooO00o));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (uriForFile != null) {
                    arrayList2.add(uriForFile);
                }
            }
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            AbstractC33687OooO0oO abstractC33687OooO0oO = C33833OooOOOO.f121946OooO00o;
            OooO00o oooO00o = new OooO00o(importBatchPdfDialogFragment, arrayList2, null);
            this.f107869OooOo0o = 1;
            if (C33609OooO0oo.OooO0o(abstractC33687OooO0oO, oooO00o, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
