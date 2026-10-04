package OooOoOO;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.aspose.words.StyleIdentifier;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24030OooOoo;
import o00ooO0.C25751OooOoo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: OooOoOO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.compose.animation.core.Animatable$runAnimation$2", m80623f = "Animatable.kt", m80624l = {StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_4}, m80625m = "invokeSuspend")
public final class C20516OooO00o extends AbstractC32476OooO implements InterfaceC32507OooOO0o<Continuation<? super C20524OooOO0<Object, AbstractC20531OooOOo>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C24030OooOoo f58587OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C20527OooOOO f58588OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C20518OooO0OO<Object, AbstractC20531OooOOo> f58589OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f58590OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ Object f58591OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ long f58592OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ C20563OoooOoo f58593OooOoo0;

    /* JADX INFO: renamed from: OooOoOO.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C18965OooO00o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<C20525OooOO0O<Object, AbstractC20531OooOOo>, C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C20527OooOOO<Object, AbstractC20531OooOOo> f58594OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C20518OooO0OO<Object, AbstractC20531OooOOo> f58595OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ C24030OooOoo f58596OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18965OooO00o(C20518OooO0OO c20518OooO0OO, C20527OooOOO c20527OooOOO, C24030OooOoo c24030OooOoo) {
            super(1);
            this.f58595OooOo0o = c20518OooO0OO;
            this.f58594OooOo = c20527OooOOO;
            this.f58596OooOoO0 = c24030OooOoo;
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [kotlin.jvm.internal.OooOOOO, oO0O000o.OooO00o] */
        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(C20525OooOO0O<Object, AbstractC20531OooOOo> c20525OooOO0O) {
            C20525OooOO0O<Object, AbstractC20531OooOOo> animate = c20525OooOO0O;
            kotlin.jvm.internal.OooOOO0.OooO0oO(animate, "$this$animate");
            C20518OooO0OO<Object, AbstractC20531OooOOo> c20518OooO0OO = this.f58595OooOo0o;
            C20562OoooOoO.OooO0o0(animate, c20518OooO0OO.f58602OooO0OO);
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = animate.f58634OooO0o0;
            Object objOooO00o = C20518OooO0OO.OooO00o(c20518OooO0OO, parcelableSnapshotMutableState.getValue());
            if (!kotlin.jvm.internal.OooOOO0.OooO0O0(objOooO00o, parcelableSnapshotMutableState.getValue())) {
                c20518OooO0OO.f58602OooO0OO.f58637OooOo.setValue(objOooO00o);
                this.f58594OooOo.f58637OooOo.setValue(objOooO00o);
                animate.f58628OooO.setValue(Boolean.FALSE);
                animate.f58632OooO0Oo.invoke();
                this.f58596OooOoO0.f80938OooOo0o = true;
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20516OooO00o(C20518OooO0OO c20518OooO0OO, Object obj, C20563OoooOoo c20563OoooOoo, long j, Continuation continuation) {
        super(1, continuation);
        this.f58589OooOoO = c20518OooO0OO;
        this.f58591OooOoOO = obj;
        this.f58593OooOoo0 = c20563OoooOoo;
        this.f58592OooOoo = j;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Continuation<?> continuation) {
        return new C20516OooO00o(this.f58589OooOoO, this.f58591OooOoOO, this.f58593OooOoo0, this.f58592OooOoo, continuation);
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Continuation<? super C20524OooOO0<Object, AbstractC20531OooOOo>> continuation) {
        return ((C20516OooO00o) create(continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        C20527OooOOO c20527OooOOO;
        C24030OooOoo c24030OooOoo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f58590OooOoO0;
        C20518OooO0OO<Object, AbstractC20531OooOOo> c20518OooO0OO = this.f58589OooOoO;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C20527OooOOO<Object, V> c20527OooOOO2 = c20518OooO0OO.f58602OooO0OO;
                V v = (V) c20518OooO0OO.f58600OooO00o.OooO00o().invoke(this.f58591OooOoOO);
                c20527OooOOO2.getClass();
                kotlin.jvm.internal.OooOOO0.OooO0oO(v, "<set-?>");
                c20527OooOOO2.f58640OooOoO0 = v;
                C20563OoooOoo c20563OoooOoo = this.f58593OooOoo0;
                c20518OooO0OO.f58605OooO0o0.setValue(c20563OoooOoo.f58749OooO0Oo);
                c20518OooO0OO.f58603OooO0Oo.setValue(Boolean.TRUE);
                C20527OooOOO<Object, V> c20527OooOOO3 = c20518OooO0OO.f58602OooO0OO;
                C20527OooOOO c20527OooOOO4 = new C20527OooOOO(c20527OooOOO3.f58638OooOo0o, c20527OooOOO3.f58637OooOo.getValue(), C25751OooOoo.OooO00o(c20527OooOOO3.f58640OooOoO0), c20527OooOOO3.f58639OooOoO, Long.MIN_VALUE, c20527OooOOO3.f58642OooOoo0);
                C24030OooOoo c24030OooOoo2 = new C24030OooOoo();
                long j = this.f58592OooOoo;
                C18965OooO00o c18965OooO00o = new C18965OooO00o(c20518OooO0OO, c20527OooOOO4, c24030OooOoo2);
                this.f58588OooOo0o = c20527OooOOO4;
                this.f58587OooOo = c24030OooOoo2;
                this.f58590OooOoO0 = 1;
                if (C20562OoooOoO.OooO00o(c20527OooOOO4, c20563OoooOoo, j, c18965OooO00o, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                c20527OooOOO = c20527OooOOO4;
                c24030OooOoo = c24030OooOoo2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c24030OooOoo = this.f58587OooOo;
                c20527OooOOO = this.f58588OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
            }
            EnumC20515OooO enumC20515OooO = c24030OooOoo.f80938OooOo0o ? EnumC20515OooO.f58585OooOo0o : EnumC20515OooO.f58584OooOo;
            C20527OooOOO<Object, V> c20527OooOOO5 = c20518OooO0OO.f58602OooO0OO;
            c20527OooOOO5.f58640OooOoO0.OooO0Oo();
            c20527OooOOO5.f58639OooOoO = Long.MIN_VALUE;
            c20518OooO0OO.f58603OooO0Oo.setValue(Boolean.FALSE);
            return new C20524OooOO0(c20527OooOOO, enumC20515OooO);
        } catch (CancellationException e) {
            C20527OooOOO<Object, V> c20527OooOOO6 = c20518OooO0OO.f58602OooO0OO;
            c20527OooOOO6.f58640OooOoO0.OooO0Oo();
            c20527OooOOO6.f58639OooOoO = Long.MIN_VALUE;
            c20518OooO0OO.f58603OooO0Oo.setValue(Boolean.FALSE);
            throw e;
        }
    }
}
