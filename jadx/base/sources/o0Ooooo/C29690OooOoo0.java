package o0Ooooo;

import com.orion.notein.domain.models.search.TextSearchResult;
import java.util.List;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0OOo0o.C27545o00o0oo0;
import o0OOo0o.C27547o00oO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0Oo.C33737OooOo00;
import oO0o0Oo.C33760OoooO00;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0Ooooo.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewViewModel$special$$inlined$flatMapLatest$6", m80623f = "EditorPreviewViewModel.kt", m80624l = {190, 189}, m80625m = "invokeSuspend")
public final class C29690OooOoo0 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super List<? extends TextSearchResult>>, String, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ InterfaceC33723OooO0oO f105255OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f105256OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.propertypanel.preview.OooO0OO f105257OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f105258OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29690OooOoo0(com.orion.notein.p607ui.noteeditor.propertypanel.preview.OooO0OO oooO0OO, Continuation continuation) {
        super(3, continuation);
        this.f105257OooOoO = oooO0OO;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC33723OooO0oO<? super List<? extends TextSearchResult>> interfaceC33723OooO0oO, String str, Continuation<? super C32460OooOooO> continuation) {
        C29690OooOoo0 c29690OooOoo0 = new C29690OooOoo0(this.f105257OooOoO, continuation);
        c29690OooOoo0.f105255OooOo = interfaceC33723OooO0oO;
        c29690OooOoo0.f105258OooOoO0 = str;
        return c29690OooOoo0.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0082, code lost:
    
        if (r11 == r0) goto L22;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        InterfaceC33723OooO0oO interfaceC33723OooO0oO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f105256OooOo0o;
        com.orion.notein.p607ui.noteeditor.propertypanel.preview.OooO0OO oooO0OO = this.f105257OooOoO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33723OooO0oO interfaceC33723OooO0oO2 = this.f105255OooOo;
            str = (String) this.f105258OooOoO0;
            C27545o00o0oo0 c27545o00o0oo0 = oooO0OO.f76068OooO0o0;
            String str2 = (String) oooO0OO.f76075OooOOO0.getValue();
            this.f105255OooOo = interfaceC33723OooO0oO2;
            this.f105258OooOoO0 = str;
            this.f105256OooOo0o = 1;
            c27545o00o0oo0.getClass();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27547o00oO0(str, c27545o00o0oo0, str2, null), this);
            if (objOooO0o != enumC32485OooO00o) {
                interfaceC33723OooO0oO = interfaceC33723OooO0oO2;
                obj = objOooO0o;
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
        str = (String) this.f105258OooOoO0;
        interfaceC33723OooO0oO = this.f105255OooOo;
        C32446OooOOOo.OooO0O0(obj);
        C33737OooOo00 c33737OooOo00 = new C33737OooOo00(new C29672OooOO0O(oooO0OO, str, null), (InterfaceC33721OooO0o) obj);
        C29673OooOO0o c29673OooOO0o = new C29673OooOO0o(oooO0OO, str, null);
        this.f105255OooOo = null;
        this.f105258OooOoO0 = null;
        this.f105256OooOo0o = 2;
        C25252OooO0Oo.OooOOO(interfaceC33723OooO0oO);
        Object objCollect = c33737OooOo00.collect(new C33760OoooO00(interfaceC33723OooO0oO, c29673OooOO0o), this);
        if (objCollect != enumC32485OooO00o) {
            objCollect = C32460OooOooO.f116667OooO00o;
        }
        if (objCollect != enumC32485OooO00o) {
            objCollect = C32460OooOooO.f116667OooO00o;
        }
    }
}
