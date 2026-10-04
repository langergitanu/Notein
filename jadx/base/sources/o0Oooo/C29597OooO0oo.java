package o0Oooo;

import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.p605ai.NoteAiContent;
import com.orion.notein.domain.models.p605ai.NoteSummary;
import com.orion.notein.global.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import o000oooo.C24761OooO;
import o0OOOo0.C27174OooO0O0;
import o0OOo0Oo.InterfaceC27287OooO0O0;
import o0OoooO.C29629OooOOo0;
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
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: o0Oooo.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.ai.EditorAiViewModel$refreshPdfSummary$2", m80623f = "EditorAiViewModel.kt", m80624l = {StyleIdentifier.GRID_TABLE_7_COLORFUL_ACCENT_5, StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_6, StyleIdentifier.LIST_TABLE_1_LIGHT, StyleIdentifier.LIST_TABLE_4_ACCENT_5, 376, StyleIdentifier.length, 392}, m80625m = "invokeSuspend")
public final class C29597OooO0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C27174OooO0O0<String>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public List f104949OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f104950OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public String f104951OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public String f104952OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f104953OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ boolean f104954OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.OooO00o f104955OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29597OooO0oo(com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.OooO00o oooO00o, boolean z, Continuation<? super C29597OooO0oo> continuation) {
        super(2, continuation);
        this.f104955OooOoo0 = oooO00o;
        this.f104954OooOoo = z;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29597OooO0oo(this.f104955OooOoo0, this.f104954OooOoo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C27174OooO0O0<String>> continuation) {
        return ((C29597OooO0oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f3, code lost:
    
        if (r2.OooO0Oo(r8, r18) == r0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x017d, code lost:
    
        if (r8 == r0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x022a, code lost:
    
        if (r2.OooO0Oo(r3, r18) != r0) goto L83;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0264  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        Object objOooO0o0;
        NoteAiContent noteAiContent;
        ArrayList arrayListO0ooOoO;
        List list;
        Object objOooO0o02;
        List list2;
        NoteSummary noteSummary;
        C27174OooO0O0 c27174OooO0O0;
        Object objOooOO0o;
        String errorCode;
        String errorMsg;
        Object objOooO0o;
        List list3;
        String str2;
        NoteAiContent noteAiContent2;
        String str3;
        NoteAiContent noteAiContent3;
        List list4;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        switch (this.f104953OooOoOO) {
            case 0:
                C32446OooOOOo.OooO0O0(obj);
                com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.OooO00o oooO00o = this.f104955OooOoo0;
                synchronized (oooO00o.f75602OooOOOO) {
                    str = (String) oooO00o.f75609OooOo00.getValue();
                }
                if (str == null) {
                    return new C27174OooO0O0("400007", "contentId is null", "", false);
                }
                com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.OooO00o oooO00o2 = this.f104955OooOoo0;
                this.f104950OooOo0o = str;
                this.f104953OooOoOO = 1;
                objOooO0o0 = com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.OooO00o.OooO0o0(oooO00o2, str, this);
                if (objOooO0o0 != enumC32485OooO00o) {
                    noteAiContent = (NoteAiContent) objOooO0o0;
                    arrayListO0ooOoO = OooOo.o0ooOoO(noteAiContent.getSummaryIdList());
                    if (!arrayListO0ooOoO.isEmpty()) {
                        InterfaceC27287OooO0O0 interfaceC27287OooO0O0 = this.f104955OooOoo0.f75592OooO0Oo;
                        this.f104950OooOo0o = noteAiContent;
                        this.f104949OooOo = arrayListO0ooOoO;
                        this.f104953OooOoOO = 2;
                        objOooO0o02 = interfaceC27287OooO0O0.OooO0o0(str, this);
                        if (objOooO0o02 != enumC32485OooO00o) {
                            list2 = arrayListO0ooOoO;
                            noteSummary = (NoteSummary) objOooO0o02;
                            if (noteSummary != null) {
                                list2.add(noteSummary.getId());
                                InterfaceC27287OooO0O0 interfaceC27287OooO0O02 = this.f104955OooOoo0.f75592OooO0Oo;
                                NoteAiContent noteAiContentCopy$default = NoteAiContent.copy$default(noteAiContent, null, list2, 0, 0L, System.currentTimeMillis(), 13, null);
                                this.f104950OooOo0o = noteAiContent;
                                this.f104949OooOo = list2;
                                this.f104953OooOoOO = 3;
                            }
                            list = list2;
                            if (list.isEmpty() && !this.f104954OooOoo) {
                                return new C27174OooO0O0("0", null, "", true);
                            }
                            if (com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.OooO00o.OooO0o(this.f104955OooOoo0)) {
                                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o.OooOOO0("EditorChatViewModel");
                                c20358OooO00o.OooO0OO("refreshPdfSummary: app version is too low", new Object[0]);
                                return new C27174OooO0O0("199997", "app version is too low", "", false);
                            }
                            if (((Number) ((C32443OooOOO) this.f104955OooOoo0.f75603OooOOOo.f121747OooOo0o.getValue()).f116638OooOo0o).intValue() <= 0) {
                                return new C27174OooO0O0("400008", "quota is running out", "", false);
                            }
                            String string = this.f104955OooOoo0.f75597OooOO0.getResources().getString(R.string.ai_prompt_summary_pdf);
                            kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                            C29629OooOOo0 c29629OooOOo0 = this.f104955OooOoo0.f75600OooOOO;
                            if (c29629OooOOo0 != null) {
                                this.f104950OooOo0o = noteAiContent;
                                this.f104949OooOo = list;
                                this.f104953OooOoOO = 4;
                                objOooOO0o = c29629OooOOo0.OooOO0o(string, this);
                            } else {
                                c27174OooO0O0 = null;
                                if ((c27174OooO0O0 == null ? (String) c27174OooO0O0.OooO0O0() : null) != null || !kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O0.getErrorCode(), "0")) {
                                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                                    c20358OooO00o2.OooO0OO(o0OOO0O0.OooOOO0.OooO0O0(c20358OooO00o2, "EditorChatViewModel", "addSummary: failed to get summary. ", c27174OooO0O0), new Object[0]);
                                    if (c27174OooO0O0 != null || (errorCode = c27174OooO0O0.getErrorCode()) == null) {
                                        errorCode = "400007";
                                    }
                                    if (c27174OooO0O0 != null || (errorMsg = c27174OooO0O0.getErrorMsg()) == null) {
                                        errorMsg = "";
                                    }
                                    return new C27174OooO0O0(errorCode, errorMsg, null, false);
                                }
                                String str4 = (String) c27174OooO0O0.OooO0O0();
                                if (str4 == null) {
                                    str4 = "";
                                }
                                String strOooO00o = C24761OooO.OooO00o("toString(...)");
                                com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.OooO00o oooO00o3 = this.f104955OooOoo0;
                                this.f104950OooOo0o = noteAiContent;
                                this.f104949OooOo = list;
                                this.f104952OooOoO0 = str4;
                                this.f104951OooOoO = strOooO00o;
                                this.f104953OooOoOO = 5;
                                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                                objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C29594OooO0o(oooO00o3, str4, null), this);
                                if (objOooO0o != enumC32485OooO00o) {
                                    String str5 = str4;
                                    list3 = list;
                                    str2 = strOooO00o;
                                    noteAiContent2 = noteAiContent;
                                    str3 = str5;
                                    if (((Boolean) objOooO0o).booleanValue()) {
                                        return new C27174OooO0O0("4000010", "failed to notify quota cost", "", false);
                                    }
                                    InterfaceC27287OooO0O0 interfaceC27287OooO0O03 = this.f104955OooOoo0.f75592OooO0Oo;
                                    this.f104950OooOo0o = noteAiContent2;
                                    this.f104949OooOo = list3;
                                    this.f104952OooOoO0 = str2;
                                    this.f104951OooOoO = null;
                                    this.f104953OooOoOO = 6;
                                    if (interfaceC27287OooO0O03.OooO0OO(str2, str3, this) != enumC32485OooO00o) {
                                        noteAiContent3 = noteAiContent2;
                                        list4 = list3;
                                        list4.add(str2);
                                        if (list4.size() > 5) {
                                            list4.remove(0);
                                        }
                                        InterfaceC27287OooO0O0 interfaceC27287OooO0O04 = this.f104955OooOoo0.f75592OooO0Oo;
                                        NoteAiContent noteAiContentCopy$default2 = NoteAiContent.copy$default(noteAiContent3, null, list4, list4.size() - 1, 0L, System.currentTimeMillis(), 9, null);
                                        this.f104950OooOo0o = null;
                                        this.f104949OooOo = null;
                                        this.f104952OooOoO0 = null;
                                        this.f104953OooOoOO = 7;
                                    }
                                }
                            }
                        }
                        break;
                    } else {
                        list = arrayListO0ooOoO;
                        if (list.isEmpty()) {
                        }
                        if (com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.OooO00o.OooO0o(this.f104955OooOoo0)) {
                        }
                    }
                }
                return enumC32485OooO00o;
            case 1:
                str = (String) this.f104950OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                objOooO0o0 = obj;
                noteAiContent = (NoteAiContent) objOooO0o0;
                arrayListO0ooOoO = OooOo.o0ooOoO(noteAiContent.getSummaryIdList());
                if (!arrayListO0ooOoO.isEmpty()) {
                }
                break;
            case 2:
                List list5 = this.f104949OooOo;
                noteAiContent = (NoteAiContent) this.f104950OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                list2 = list5;
                objOooO0o02 = obj;
                noteSummary = (NoteSummary) objOooO0o02;
                if (noteSummary != null) {
                }
                list = list2;
                if (list.isEmpty()) {
                }
                if (com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.OooO00o.OooO0o(this.f104955OooOoo0)) {
                }
                break;
            case 3:
                list = this.f104949OooOo;
                noteAiContent = (NoteAiContent) this.f104950OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                if (list.isEmpty()) {
                }
                if (com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.OooO00o.OooO0o(this.f104955OooOoo0)) {
                }
                break;
            case 4:
                list = this.f104949OooOo;
                noteAiContent = (NoteAiContent) this.f104950OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                objOooOO0o = obj;
                c27174OooO0O0 = (C27174OooO0O0) objOooOO0o;
                if ((c27174OooO0O0 == null ? (String) c27174OooO0O0.OooO0O0() : null) != null) {
                    break;
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o22 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o22.OooO0OO(o0OOO0O0.OooOOO0.OooO0O0(c20358OooO00o22, "EditorChatViewModel", "addSummary: failed to get summary. ", c27174OooO0O0), new Object[0]);
                if (c27174OooO0O0 != null) {
                    errorCode = "400007";
                }
                if (c27174OooO0O0 != null) {
                    errorMsg = "";
                }
                return new C27174OooO0O0(errorCode, errorMsg, null, false);
            case 5:
                str2 = this.f104951OooOoO;
                str3 = this.f104952OooOoO0;
                list3 = this.f104949OooOo;
                noteAiContent2 = (NoteAiContent) this.f104950OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                objOooO0o = obj;
                if (((Boolean) objOooO0o).booleanValue()) {
                }
                break;
            case 6:
                str2 = this.f104952OooOoO0;
                List list6 = this.f104949OooOo;
                NoteAiContent noteAiContent4 = (NoteAiContent) this.f104950OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                list4 = list6;
                noteAiContent3 = noteAiContent4;
                list4.add(str2);
                if (list4.size() > 5) {
                }
                InterfaceC27287OooO0O0 interfaceC27287OooO0O042 = this.f104955OooOoo0.f75592OooO0Oo;
                NoteAiContent noteAiContentCopy$default22 = NoteAiContent.copy$default(noteAiContent3, null, list4, list4.size() - 1, 0L, System.currentTimeMillis(), 9, null);
                this.f104950OooOo0o = null;
                this.f104949OooOo = null;
                this.f104952OooOoO0 = null;
                this.f104953OooOoOO = 7;
                break;
            case 7:
                C32446OooOOOo.OooO0O0(obj);
                return new C27174OooO0O0("0", null, "", true);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
