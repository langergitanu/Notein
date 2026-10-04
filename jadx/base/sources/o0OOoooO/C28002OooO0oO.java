package o0OOoooO;

import com.orion.notein.data.p602db.entity.FolderEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0OOoooO.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C28002OooO0oO<T> implements InterfaceC33723OooO0oO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C28009OooOOOO f99307OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33723OooO0oO f99308OooOo0o;

    /* JADX INFO: renamed from: o0OOoooO.OooO0oO$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.folder.FolderRepoImpl$getFoldersById$$inlined$map$1$2", m80623f = "FolderRepoImpl.kt", m80624l = {50}, m80625m = "emit")
    public static final class OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f99309OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f99310OooOo0o;

        public OooO00o(Continuation continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f99310OooOo0o = obj;
            this.f99309OooOo |= Integer.MIN_VALUE;
            return C28002OooO0oO.this.emit(null, this);
        }
    }

    public C28002OooO0oO(InterfaceC33723OooO0oO interfaceC33723OooO0oO, C28009OooOOOO c28009OooOOOO) {
        this.f99308OooOo0o = interfaceC33723OooO0oO;
        this.f99307OooOo = c28009OooOOOO;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // oO0o0Oo.InterfaceC33723OooO0oO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OooO00o oooO00o;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f99309OooOo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f99309OooOo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        }
        Object obj2 = oooO00o.f99310OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO00o.f99309OooOo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj2);
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(this.f99307OooOo.f99336OooO0O0.toFolder((FolderEntity) it.next()));
            }
            oooO00o.f99309OooOo = 1;
            if (this.f99308OooOo0o.emit(arrayList, oooO00o) == enumC32485OooO00o) {
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
