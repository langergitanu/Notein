package o0OOO0oo;

import com.orion.notein.data.p602db.entity.StickerCollectionEntity;
import com.orion.notein.domain.models.sticker.StickerCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0OOO0oo.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27067OooO0o implements InterfaceC33721OooO0o<List<? extends StickerCollection>> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27073OooOO0o f94219OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f94220OooOo0o;

    /* JADX INFO: renamed from: o0OOO0oo.OooO0o$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C27073OooOO0o f94221OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f94222OooOo0o;

        /* JADX INFO: renamed from: o0OOO0oo.OooO0o$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.sticker.StickerLocalDataSource$getStickerCollection$$inlined$map$1$2", m80623f = "StickerLocalDataSource.kt", m80624l = {50}, m80625m = "emit")
        public static final class C19841OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f94223OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f94224OooOo0o;

            public C19841OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f94224OooOo0o = obj;
                this.f94223OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, C27073OooOO0o c27073OooOO0o) {
            this.f94222OooOo0o = interfaceC33723OooO0oO;
            this.f94221OooOo = c27073OooOO0o;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C19841OooO00o c19841OooO00o;
            if (continuation instanceof C19841OooO00o) {
                c19841OooO00o = (C19841OooO00o) continuation;
                int i = c19841OooO00o.f94223OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c19841OooO00o.f94223OooOo = i - Integer.MIN_VALUE;
                } else {
                    c19841OooO00o = new C19841OooO00o(continuation);
                }
            }
            Object obj2 = c19841OooO00o.f94224OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c19841OooO00o.f94223OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(this.f94221OooOo.f94247OooO0OO.toStickerCollection((StickerCollectionEntity) it.next()));
                }
                c19841OooO00o.f94223OooOo = 1;
                if (this.f94222OooOo0o.emit(arrayList, c19841OooO00o) == enumC32485OooO00o) {
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

    public C27067OooO0o(InterfaceC33721OooO0o interfaceC33721OooO0o, C27073OooOO0o c27073OooOO0o) {
        this.f94220OooOo0o = interfaceC33721OooO0o;
        this.f94219OooOo = c27073OooOO0o;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super List<? extends StickerCollection>> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f94220OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO, this.f94219OooOo), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}
