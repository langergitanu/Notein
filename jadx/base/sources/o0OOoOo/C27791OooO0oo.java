package o0OOoOo;

import com.orion.notein.domain.models.note.LatestOpenedNote;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0OOoOo.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27791OooO0oo<T> implements InterfaceC33723OooO0oO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ List f98167OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33723OooO0oO f98168OooOo0o;

    /* JADX INFO: renamed from: o0OOoOo.OooO0oo$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.latestopenednote.GetLatestOpenedNoteUseCase$getLatestOpenedNotes$lambda$4$$inlined$map$1$2", m80623f = "GetLatestOpenedNoteUseCase.kt", m80624l = {50}, m80625m = "emit")
    public static final class OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f98169OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f98170OooOo0o;

        public OooO00o(Continuation continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f98170OooOo0o = obj;
            this.f98169OooOo |= Integer.MIN_VALUE;
            return C27791OooO0oo.this.emit(null, this);
        }
    }

    public C27791OooO0oo(InterfaceC33723OooO0oO interfaceC33723OooO0oO, List list) {
        this.f98168OooOo0o = interfaceC33723OooO0oO;
        this.f98167OooOo = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // oO0o0Oo.InterfaceC33723OooO0oO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OooO00o oooO00o;
        T next;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f98169OooOo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f98169OooOo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        }
        Object obj2 = oooO00o.f98170OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO00o.f98169OooOo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj2);
            ArrayList arrayList = new ArrayList();
            for (NoteMeta noteMeta : (List) obj) {
                Iterator<T> it = this.f98167OooOo.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = (T) null;
                        break;
                    }
                    next = it.next();
                    if (OooOOO0.OooO0O0(noteMeta.getId(), ((LatestOpenedNote) next).getNoteId())) {
                        break;
                    }
                }
                LatestOpenedNote latestOpenedNote = next;
                C32443OooOOO c32443OooOOO = latestOpenedNote != null ? new C32443OooOOO(latestOpenedNote, noteMeta) : null;
                if (c32443OooOOO != null) {
                    arrayList.add(c32443OooOOO);
                }
            }
            oooO00o.f98169OooOo = 1;
            if (this.f98168OooOo0o.emit(arrayList, oooO00o) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj2);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
