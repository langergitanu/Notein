package o0OOO0oo;

import com.orion.notein.data.p602db.entity.StickerEntity;
import com.orion.notein.domain.models.sticker.Sticker;
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

/* JADX INFO: renamed from: o0OOO0oo.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27072OooOO0O implements InterfaceC33721OooO0o<List<? extends Sticker>> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27073OooOO0o f94238OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f94239OooOo0o;

    /* JADX INFO: renamed from: o0OOO0oo.OooOO0O$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C27073OooOO0o f94240OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f94241OooOo0o;

        /* JADX INFO: renamed from: o0OOO0oo.OooOO0O$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.sticker.StickerLocalDataSource$getStickersByParentId$$inlined$map$1$2", m80623f = "StickerLocalDataSource.kt", m80624l = {50}, m80625m = "emit")
        public static final class C19842OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f94242OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f94243OooOo0o;

            public C19842OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f94243OooOo0o = obj;
                this.f94242OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, C27073OooOO0o c27073OooOO0o) {
            this.f94241OooOo0o = interfaceC33723OooO0oO;
            this.f94240OooOo = c27073OooOO0o;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C19842OooO00o c19842OooO00o;
            if (continuation instanceof C19842OooO00o) {
                c19842OooO00o = (C19842OooO00o) continuation;
                int i = c19842OooO00o.f94242OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c19842OooO00o.f94242OooOo = i - Integer.MIN_VALUE;
                } else {
                    c19842OooO00o = new C19842OooO00o(continuation);
                }
            }
            Object obj2 = c19842OooO00o.f94243OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c19842OooO00o.f94242OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(this.f94240OooOo.f94247OooO0OO.toSticker((StickerEntity) it.next()));
                }
                c19842OooO00o.f94242OooOo = 1;
                if (this.f94241OooOo0o.emit(arrayList, c19842OooO00o) == enumC32485OooO00o) {
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

    public C27072OooOO0O(InterfaceC33721OooO0o interfaceC33721OooO0o, C27073OooOO0o c27073OooOO0o) {
        this.f94239OooOo0o = interfaceC33721OooO0o;
        this.f94238OooOo = c27073OooOO0o;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super List<? extends Sticker>> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f94239OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO, this.f94238OooOo), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}
