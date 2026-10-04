package o0o00oOo;

import android.util.Log;
import com.google.firebase.messaging.Constants;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.p607ui.p609vo.NoteVO;
import java.io.Serializable;
import java.util.List;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0OOo0o.C27449o00O0OoO;
import o0OOoOo0.C27811OooOo;
import o0OOoOo0.C27812OooOo0;
import o0OOoOo0.C27814OooOo0O;
import o0OOoOo0.C27817OooOoO0;
import o0OOoOo0.C27819OooOoo;
import o0Oo0ooO.C28422OooOOo;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32511OooOOoo;
import oO0o0Oo.InterfaceC33721OooO0o;

/* JADX INFO: renamed from: o0o00oOo.Oooo00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListViewModel$_noteMetasInCurrentFolder$1", m80623f = "NoteListViewModel.kt", m80624l = {449}, m80625m = "invokeSuspend")
public final class C30055Oooo00o extends AbstractC32476OooO implements InterfaceC32511OooOOoo<C32443OooOOO<? extends NoteVO, ? extends NoteVO>, String, Long, Integer, Continuation<? super InterfaceC33721OooO0o<? extends List<? extends NoteMeta>>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f106904OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public NoteVO f106905OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Object f106906OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f106907OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public /* synthetic */ String f106908OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public /* synthetic */ int f106909OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public /* synthetic */ long f106910OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.notelist.OooO0OO f106911OooOooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30055Oooo00o(com.orion.notein.p607ui.notelist.OooO0OO oooO0OO, Continuation<? super C30055Oooo00o> continuation) {
        super(5, continuation);
        this.f106911OooOooO = oooO0OO;
    }

    @Override // oO0O000o.InterfaceC32511OooOOoo
    public final Object Oooo0oO(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable) {
        long jLongValue = ((Number) obj3).longValue();
        int iIntValue = ((Number) obj4).intValue();
        C30055Oooo00o c30055Oooo00o = new C30055Oooo00o(this.f106911OooOooO, (Continuation) serializable);
        c30055Oooo00o.f106906OooOoO = (C32443OooOOO) obj;
        c30055Oooo00o.f106908OooOoOO = (String) obj2;
        c30055Oooo00o.f106910OooOoo0 = jLongValue;
        c30055Oooo00o.f106909OooOoo = iIntValue;
        return c30055Oooo00o.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        InterfaceC33721OooO0o<List<NoteMeta>> interfaceC33721OooO0oOooOoo0;
        InterfaceC33721OooO0o<List<NoteMeta>> interfaceC33721OooO0o;
        String str;
        Object objOooOOo;
        NoteVO noteVO;
        long j;
        String str2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f106907OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C32443OooOOO c32443OooOOO = (C32443OooOOO) this.f106906OooOoO;
            String userId = this.f106908OooOoOO;
            long j2 = this.f106910OooOoo0;
            int i2 = this.f106909OooOoo;
            long jCurrentTimeMillis = System.currentTimeMillis();
            NoteVO noteVO2 = (NoteVO) c32443OooOOO.f116638OooOo0o;
            com.orion.notein.p607ui.notelist.OooO0OO oooO0OO = this.f106911OooOooO;
            String str3 = (String) oooO0OO.f77151Oooo00O.getValue();
            C27819OooOoo c27819OooOoo = oooO0OO.f77134OooOOo0;
            if (i2 != 0) {
                int i3 = ((C28422OooOOo) ((List) oooO0OO.f77153Oooo0O0.f121747OooOo0o.getValue()).get(i2)).f100769OooO00o;
                c27819OooOoo.getClass();
                kotlin.jvm.internal.OooOOO0.OooO0oO(userId, "userId");
                return C25252OooO0Oo.OooOoO(C25252OooO0Oo.OooOoO(c27819OooOoo.f98267OooO00o.OooO0oo(i3), new C27812OooOo0(null, c27819OooOoo)), new C27814OooOo0O(null, c27819OooOoo, userId));
            }
            C27449o00O0OoO c27449o00O0OoO = oooO0OO.f77121OooO0Oo;
            if (noteVO2 != null) {
                interfaceC33721OooO0oOooOoo0 = c27449o00O0OoO.OooOoo0(noteVO2.getId(), userId);
            } else if (kotlin.jvm.internal.OooOOO0.OooO0O0(str3, NoteMeta.PROPERTY_FAVORITE)) {
                interfaceC33721OooO0oOooOoo0 = c27449o00O0OoO.OooOo0(userId);
            } else if (kotlin.jvm.internal.OooOOO0.OooO0O0(str3, Constants.ScionAnalytics.PARAM_LABEL)) {
                c27819OooOoo.getClass();
                kotlin.jvm.internal.OooOOO0.OooO0oO(userId, "userId");
                interfaceC33721OooO0oOooOoo0 = C25252OooO0Oo.OooOo(new C27817OooOoO0(2, null), C25252OooO0Oo.OooOoO(c27819OooOoo.f98267OooO00o.OooO00o(com.facebook.soloader.OooOo.OooO0oO(Long.valueOf(j2))), new C27811OooOo(null, c27819OooOoo, userId)));
            } else {
                interfaceC33721OooO0oOooOoo0 = c27449o00O0OoO.OooOoo0(null, userId);
            }
            interfaceC33721OooO0o = interfaceC33721OooO0oOooOoo0;
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            this.f106906OooOoO = interfaceC33721OooO0o;
            this.f106908OooOoOO = str3;
            this.f106905OooOo0o = noteVO2;
            str = "NoteListViewModel";
            this.f106904OooOo = "NoteListViewModel";
            this.f106910OooOoo0 = jCurrentTimeMillis2;
            this.f106907OooOoO0 = 1;
            objOooOOo = C25252OooO0Oo.OooOOo(interfaceC33721OooO0o, this);
            if (objOooOOo == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            noteVO = noteVO2;
            j = jCurrentTimeMillis2;
            str2 = str3;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.f106910OooOoo0;
            String str4 = this.f106904OooOo;
            noteVO = this.f106905OooOo0o;
            str2 = this.f106908OooOoOO;
            interfaceC33721OooO0o = (InterfaceC33721OooO0o) this.f106906OooOoO;
            C32446OooOOOo.OooO0O0(obj);
            str = str4;
            objOooOOo = obj;
        }
        Log.d(str, "loadNoteMetas cost: " + j + ", folder: " + noteVO + ", root: " + str2 + ", metas size: " + ((List) objOooOOo).size());
        return interfaceC33721OooO0o;
    }
}
