package o0Ooooo;

import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.page.Page;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0Ooooo.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewViewModel$checkPageTn$2", m80623f = "EditorPreviewViewModel.kt", m80624l = {StyleIdentifier.LIST_TABLE_4_ACCENT_6}, m80625m = "invokeSuspend")
public final class C29675OooOOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.propertypanel.preview.OooO0OO f105206OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f105207OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f105208OooOoO0;

    /* JADX INFO: renamed from: o0Ooooo.OooOOO0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewViewModel$checkPageTn$2$1", m80623f = "EditorPreviewViewModel.kt", m80624l = {StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_6, StyleIdentifier.HASHTAG}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ com.orion.notein.p607ui.noteeditor.propertypanel.preview.OooO0OO f105209OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f105210OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ String f105211OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(com.orion.notein.p607ui.noteeditor.propertypanel.preview.OooO0OO oooO0OO, String str, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f105209OooOo = oooO0OO;
            this.f105211OooOoO0 = str;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f105209OooOo, this.f105211OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x009c, code lost:
        
            if (r2.f76069OooO0oO.OooO00o(r10, r3, true, r9) == r0) goto L30;
         */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f105210OooOo0o;
            com.orion.notein.p607ui.noteeditor.propertypanel.preview.OooO0OO oooO0OO = this.f105209OooOo;
            String str = this.f105211OooOoO0;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f105210OooOo0o = 1;
                obj = oooO0OO.f76066OooO0Oo.OooOooO(str, this);
                if (obj != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : (List) obj) {
                Page page = (Page) obj2;
                if (page.getTnPath().length() == 0 || !new File(page.getTnPath()).exists()) {
                    arrayList.add(obj2);
                }
            }
            if (!arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((Page) it.next()).getId());
                }
                Set setO0OO00O = oOo000Oo.OooOo.o0OO00O(arrayList2);
                this.f105210OooOo0o = 2;
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29675OooOOO0(com.orion.notein.p607ui.noteeditor.propertypanel.preview.OooO0OO oooO0OO, String str, Continuation<? super C29675OooOOO0> continuation) {
        super(2, continuation);
        this.f105206OooOo = oooO0OO;
        this.f105208OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29675OooOOO0(this.f105206OooOo, this.f105208OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29675OooOOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f105207OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
            OooO00o oooO00o = new OooO00o(this.f105206OooOo, this.f105208OooOoO0, null);
            this.f105207OooOo0o = 1;
            if (C33609OooO0oo.OooO0o(executorC33873OooO0O0, oooO00o, this) == enumC32485OooO00o) {
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
