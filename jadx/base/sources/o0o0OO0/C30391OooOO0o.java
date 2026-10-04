package o0o0OO0;

import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.domain.models.ocr.AiOcrSession;
import com.orion.notein.domain.models.ocr.AiOcrSessionInputSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.Continuation;
import o000oooo.C24761OooO;
import o0OOo0Oo.InterfaceC27288OooO0OO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0o0OO0.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.viewmodel.AiOcrViewModel$createNewSessionForNote$2", m80623f = "AiOcrViewModel.kt", m80624l = {445, 451, 453, 482, 483}, m80625m = "invokeSuspend")
public final class C30391OooOO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super AiOcrSession>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public NoteMeta f108474OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f108475OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C30394OooOOOO f108476OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f108477OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f108478OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30391OooOO0o(C30394OooOOOO c30394OooOOOO, String str, Continuation<? super C30391OooOO0o> continuation) {
        super(2, continuation);
        this.f108476OooOoO = c30394OooOOOO;
        this.f108478OooOoOO = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30391OooOO0o(this.f108476OooOoO, this.f108478OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super AiOcrSession> continuation) {
        return ((C30391OooOO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a5 A[LOOP:0: B:35:0x009f->B:37:0x00a5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012b A[RETURN] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objOooOO0O;
        String str;
        Object objOooOoOO;
        NoteMeta noteMeta;
        Object objOooO0oO;
        String str2;
        NoteMeta noteMeta2;
        Iterator it;
        Set setO0OO00O;
        String title;
        AiOcrSession aiOcrSession;
        String str3;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f108477OooOoO0;
        C30394OooOOOO c30394OooOOOO = this.f108476OooOoO;
        String str4 = this.f108478OooOoOO;
        InterfaceC27288OooO0OO interfaceC27288OooO0OO = c30394OooOOOO.f108495OooO0o0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f108477OooOoO0 = 1;
            objOooOO0O = c30394OooOOOO.OooOO0O(this);
            if (objOooOO0O != enumC32485OooO00o) {
            }
        }
        if (i != 1) {
            if (i == 2) {
                str = this.f108475OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                objOooOoOO = obj;
                noteMeta = (NoteMeta) objOooOoOO;
                if (noteMeta != null) {
                    return null;
                }
                this.f108475OooOo0o = str;
                this.f108474OooOo = noteMeta;
                this.f108477OooOoO0 = 3;
                objOooO0oO = interfaceC27288OooO0OO.OooO0oO(str, this);
                if (objOooO0oO != enumC32485OooO00o) {
                    str2 = str;
                    noteMeta2 = noteMeta;
                    Iterable iterable = (Iterable) objOooO0oO;
                    ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
                    it = iterable.iterator();
                    while (it.hasNext()) {
                    }
                    setO0OO00O = oOo000Oo.OooOo.o0OO00O(arrayList);
                    title = noteMeta2.getTitle();
                    while (setO0OO00O.contains(title)) {
                        title = noteMeta2.getTitle() + " (" + i + ")";
                    }
                    String strOooO00o = C24761OooO.OooO00o("toString(...)");
                    aiOcrSession = new AiOcrSession(strOooO00o, str2, title, C34434OooOoO.f123453OooOo0o, new AiOcrSessionInputSource(C24761OooO.OooO00o("toString(...)"), 3, com.facebook.soloader.OooOo.OooO0oO(str4), null, 8, null), System.currentTimeMillis(), System.currentTimeMillis());
                    this.f108475OooOo0o = strOooO00o;
                    this.f108474OooOo = null;
                    this.f108477OooOoO0 = 4;
                    if (interfaceC27288OooO0OO.OooO0o(aiOcrSession, this) != enumC32485OooO00o) {
                    }
                }
            }
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    return obj;
                }
                str3 = this.f108475OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                this.f108475OooOo0o = null;
                this.f108477OooOoO0 = 5;
                Object objOooO0oO2 = C30394OooOOOO.OooO0oO(c30394OooOOOO, str3, this);
                return objOooO0oO2 != enumC32485OooO00o ? enumC32485OooO00o : objOooO0oO2;
            }
            noteMeta2 = this.f108474OooOo;
            String str5 = this.f108475OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            str2 = str5;
            objOooO0oO = obj;
            Iterable iterable2 = (Iterable) objOooO0oO;
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(iterable2, 10));
            it = iterable2.iterator();
            while (it.hasNext()) {
                arrayList2.add(((AiOcrSession) it.next()).getTitle());
            }
            setO0OO00O = oOo000Oo.OooOo.o0OO00O(arrayList2);
            title = noteMeta2.getTitle();
            for (int i2 = 1; setO0OO00O.contains(title) && i2 < 100; i2++) {
                title = noteMeta2.getTitle() + " (" + i2 + ")";
            }
            String strOooO00o2 = C24761OooO.OooO00o("toString(...)");
            aiOcrSession = new AiOcrSession(strOooO00o2, str2, title, C34434OooOoO.f123453OooOo0o, new AiOcrSessionInputSource(C24761OooO.OooO00o("toString(...)"), 3, com.facebook.soloader.OooOo.OooO0oO(str4), null, 8, null), System.currentTimeMillis(), System.currentTimeMillis());
            this.f108475OooOo0o = strOooO00o2;
            this.f108474OooOo = null;
            this.f108477OooOoO0 = 4;
            if (interfaceC27288OooO0OO.OooO0o(aiOcrSession, this) != enumC32485OooO00o) {
                str3 = strOooO00o2;
                this.f108475OooOo0o = null;
                this.f108477OooOoO0 = 5;
                Object objOooO0oO22 = C30394OooOOOO.OooO0oO(c30394OooOOOO, str3, this);
                if (objOooO0oO22 != enumC32485OooO00o) {
                }
            }
        }
        C32446OooOOOo.OooO0O0(obj);
        objOooOO0O = obj;
        str = (String) objOooOO0O;
        if (str == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("AiOcrViewModel");
            c20358OooO00o.OooO0OO("createNewSessionForNote failed. User not found.", new Object[0]);
            return null;
        }
        this.f108475OooOo0o = str;
        this.f108477OooOoO0 = 2;
        objOooOoOO = c30394OooOOOO.f108497OooO0oo.OooOoOO(str4, this);
        if (objOooOoOO != enumC32485OooO00o) {
            noteMeta = (NoteMeta) objOooOoOO;
            if (noteMeta != null) {
            }
        }
    }
}
