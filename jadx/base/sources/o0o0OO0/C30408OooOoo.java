package o0o0OO0;

import com.orion.notein.domain.models.ocr.AiOcrSession;
import com.orion.notein.domain.models.ocr.AiOcrTextPage;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import o0OO00o0.o0Oo0oo;
import o0OOO0.C26985OooO0o0;
import o0OOo0Oo.InterfaceC27289OooO0Oo;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0Oo.C33716OooO;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: renamed from: o0o0OO0.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.viewmodel.AiOcrViewModel$special$$inlined$flatMapLatest$4", m80623f = "AiOcrViewModel.kt", m80624l = {197, 189}, m80625m = "invokeSuspend")
public final class C30408OooOoo extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super List<? extends AiOcrTextPage>>, AiOcrSession, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ InterfaceC33723OooO0oO f108589OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f108590OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C30394OooOOOO f108591OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f108592OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30408OooOoo(Continuation continuation, C30394OooOOOO c30394OooOOOO) {
        super(3, continuation);
        this.f108591OooOoO = c30394OooOOOO;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC33723OooO0oO<? super List<? extends AiOcrTextPage>> interfaceC33723OooO0oO, AiOcrSession aiOcrSession, Continuation<? super C32460OooOooO> continuation) {
        C30408OooOoo c30408OooOoo = new C30408OooOoo(continuation, this.f108591OooOoO);
        c30408OooOoo.f108589OooOo = interfaceC33723OooO0oO;
        c30408OooOoo.f108592OooOoO0 = aiOcrSession;
        return c30408OooOoo.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009f, code lost:
    
        if (o00o00O0.C25252OooO0Oo.OooOOO0(r12, r5, r11) != r0) goto L32;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC33723OooO0oO interfaceC33723OooO0oO;
        InterfaceC33721OooO0o c33716OooO;
        List<String> pageIds;
        InterfaceC33723OooO0oO interfaceC33723OooO0oO2;
        Map map;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f108590OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            interfaceC33723OooO0oO = this.f108589OooOo;
            AiOcrSession aiOcrSession = (AiOcrSession) this.f108592OooOoO0;
            if (aiOcrSession != null && (pageIds = aiOcrSession.getPageIds()) != null) {
                List<String> list = pageIds;
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                int i2 = 0;
                for (Object obj2 : list) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        C34429OooOOo0.OooOOo();
                        throw null;
                    }
                    arrayList.add(new C32443OooOOO((String) obj2, new Integer(i2)));
                    i2 = i3;
                }
                Map mapOooOO0o = C34444Oooo0O0.OooOO0o(arrayList);
                InterfaceC27289OooO0Oo interfaceC27289OooO0Oo = this.f108591OooOoO.f108494OooO0o;
                this.f108589OooOo = interfaceC33723OooO0oO;
                this.f108592OooOoO0 = mapOooOO0o;
                this.f108590OooOo0o = 1;
                C26985OooO0o0 c26985OooO0o0OooO00o = interfaceC27289OooO0Oo.OooO00o(pageIds);
                if (c26985OooO0o0OooO00o != enumC32485OooO00o) {
                    interfaceC33723OooO0oO2 = interfaceC33723OooO0oO;
                    obj = c26985OooO0o0OooO00o;
                    map = mapOooOO0o;
                }
                return enumC32485OooO00o;
            }
            c33716OooO = new C33716OooO(C34434OooOoO.f123453OooOo0o);
            this.f108589OooOo = null;
            this.f108592OooOoO0 = null;
            this.f108590OooOo0o = 2;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            map = (Map) this.f108592OooOoO0;
            interfaceC33723OooO0oO2 = this.f108589OooOo;
            C32446OooOOOo.OooO0O0(obj);
        }
        c33716OooO = new o0Oo0oo((InterfaceC33721OooO0o) obj, map, 2);
        interfaceC33723OooO0oO = interfaceC33723OooO0oO2;
        this.f108589OooOo = null;
        this.f108592OooOoO0 = null;
        this.f108590OooOo0o = 2;
    }
}
