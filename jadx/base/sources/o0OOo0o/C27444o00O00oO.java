package o0OOo0o;

import com.orion.notein.domain.models.note.Note;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o000oooo.C24761OooO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OOo0o.o00O00oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteUseCase$duplicatedNotes$2", m80623f = "NoteUseCase.kt", m80624l = {1848, 1851, 1852}, m80625m = "invokeSuspend")
public final class C27444o00O00oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Iterator f95949OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C27449o00O0OoO f95950OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C27449o00O0OoO f95951OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f95952OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ List<String> f95953OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27444o00O00oO(C27449o00O0OoO c27449o00O0OoO, List<String> list, Continuation<? super C27444o00O00oO> continuation) {
        super(2, continuation);
        this.f95951OooOoO = c27449o00O0OoO;
        this.f95953OooOoOO = list;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27444o00O00oO(this.f95951OooOoO, this.f95953OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C27444o00O00oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        if (r9 == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0086, code lost:
    
        if (oO00ooO.C32460OooOooO.f116667OooO00o == r0) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0079 -> B:31:0x0089). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0086 -> B:31:0x0089). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        Iterator it2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f95952OooOoO0;
        C27449o00O0OoO c27449o00O0OoO = this.f95951OooOoO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f95952OooOoO0 = 1;
            obj = c27449o00O0OoO.OooOoo(this.f95953OooOoOO, this);
        } else if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
        } else if (i == 2) {
            it2 = this.f95949OooOo;
            c27449o00O0OoO = this.f95950OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            if (!((Boolean) obj).booleanValue()) {
            }
            if (((Boolean) obj) != null) {
            }
            it = it2;
            if (!it.hasNext()) {
            }
        } else {
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it2 = this.f95949OooOo;
            c27449o00O0OoO = this.f95950OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            it = it2;
            if (!it.hasNext()) {
                Note note = (Note) it.next();
                String strOooO00o = C24761OooO.OooO00o("toString(...)");
                String id = note.getId();
                this.f95950OooOo0o = c27449o00O0OoO;
                this.f95949OooOo = it;
                this.f95952OooOoO0 = 2;
                Object objOooOOo0 = c27449o00O0OoO.OooOOo0(id, strOooO00o, this);
                if (objOooOOo0 != enumC32485OooO00o) {
                    it2 = it;
                    obj = objOooOOo0;
                    if (!((Boolean) obj).booleanValue()) {
                        obj = null;
                    }
                    if (((Boolean) obj) != null) {
                        this.f95950OooOo0o = c27449o00O0OoO;
                        this.f95949OooOo = it2;
                        this.f95952OooOoO0 = 3;
                        c27449o00O0OoO.getClass();
                    }
                    it = it2;
                    if (!it.hasNext()) {
                        return C32460OooOooO.f116667OooO00o;
                    }
                }
                return enumC32485OooO00o;
            }
        }
        it = ((List) obj).iterator();
        if (!it.hasNext()) {
        }
    }
}
