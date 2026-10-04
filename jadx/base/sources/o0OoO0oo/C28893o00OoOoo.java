package o0OoO0oo;

import android.content.Context;
import com.orion.notein.domain.workmanager.PageTextCacheUpdateWorker;
import com.orion.notein.p607ui.noteeditor.C23344OooOOo;
import java.util.Collections;
import java.util.HashMap;
import kotlin.coroutines.Continuation;
import o00O0O0o.OooOOO0;
import o00O0OO0.C24847OooO0oO;
import o00o00O0.C25252OooO0Oo;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OoO0oo.o00OoOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorViewModel$1", m80623f = "NoteEditorViewModel.kt", m80624l = {406}, m80625m = "invokeSuspend")
public final class C28893o00OoOoo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C23344OooOOo f102362OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f102363OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Context f102364OooOoO0;

    /* JADX INFO: renamed from: o0OoO0oo.o00OoOoo$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorViewModel$1$1", m80623f = "NoteEditorViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C32443OooOOO<? extends String, ? extends Long>, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C23344OooOOo f102365OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f102366OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ Context f102367OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C23344OooOOo c23344OooOOo, Context context, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f102365OooOo = c23344OooOOo;
            this.f102367OooOoO0 = context;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f102365OooOo, this.f102367OooOoO0, continuation);
            oooO00o.f102366OooOo0o = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(C32443OooOOO<? extends String, ? extends Long> c32443OooOOO, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(c32443OooOOO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            String noteId = (String) ((C32443OooOOO) this.f102366OooOo0o).f116638OooOo0o;
            this.f102365OooOo.f73544OooO.getClass();
            kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
            o00O0OO0.OooOO0O oooOO0OOoooooO = o00O0OO0.OooOO0O.OoooooO(this.f102367OooOoO0);
            kotlin.jvm.internal.OooOOO0.OooO0o(oooOO0OOoooooO, "getInstance(...)");
            HashMap map = new HashMap();
            map.put("key_input_note_id", noteId);
            androidx.work.OooO0O0 oooO0O0 = new androidx.work.OooO0O0(map);
            androidx.work.OooO0O0.OooO0OO(oooO0O0);
            OooOOO0.OooO00o oooO00o = new OooOOO0.OooO00o(PageTextCacheUpdateWorker.class);
            oooO00o.f84274OooO0O0.f84462OooO0o0 = oooO0O0;
            new C24847OooO0oO(oooOO0OOoooooO, "PageTextCacheUpdateWorker", o00O0O0o.OooO0o.f84244OooOo0o, Collections.singletonList(oooO00o.OooO00o())).Oooo();
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28893o00OoOoo(C23344OooOOo c23344OooOOo, Context context, Continuation<? super C28893o00OoOoo> continuation) {
        super(2, continuation);
        this.f102362OooOo = c23344OooOOo;
        this.f102364OooOoO0 = context;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28893o00OoOoo(this.f102362OooOo, this.f102364OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28893o00OoOoo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f102363OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C23344OooOOo c23344OooOOo = this.f102362OooOo;
            long valueAsLong = c23344OooOOo.f73549OooO0oo.f95374OooO00o.getValueAsLong("rconfig_page_text_update_job_enqueue_interval_in_ms");
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("NoteEditorViewModel");
            c20358OooO00o.OooO0o0("page text cache update job enqueue interval: " + valueAsLong, new Object[0]);
            if (valueAsLong <= 0) {
                c20358OooO00o.OooOOO0("NoteEditorViewModel");
                c20358OooO00o.OooOO0O("page text cache update job is disallow.", new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            InterfaceC33721OooO0o interfaceC33721OooO0oOooOO0O = C25252OooO0Oo.OooOO0O(c23344OooOOo.f73617ooOO, valueAsLong);
            OooO00o oooO00o = new OooO00o(c23344OooOOo, this.f102364OooOoO0, null);
            this.f102363OooOo0o = 1;
            if (C25252OooO0Oo.OooO0oO(interfaceC33721OooO0oOooOO0O, oooO00o, this) == enumC32485OooO00o) {
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
