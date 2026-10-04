package o0OOO0O0;

import com.orion.notein.data.p602db.entity.NoteinAiQuotaRecordEntityV2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oo0oO0.InterfaceC34994oOooo0o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.ocr.datasource.VertexAiLocalDataSource$setUserAiQuotaRecords$2", m80623f = "VertexAiLocalDataSource.kt", m80624l = {177, 184, 188}, m80625m = "invokeSuspend")
public final class OooOO0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f93956OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public ArrayList f93957OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f93958OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C27004OooOO0o f93959OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ ArrayList f93960OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(C27004OooOO0o c27004OooOO0o, String str, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f93959OooOoO0 = c27004OooOO0o;
        this.f93958OooOoO = str;
        this.f93960OooOoOO = arrayList;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooOO0O(this.f93959OooOoO0, this.f93958OooOoO, this.f93960OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooOO0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e8, code lost:
    
        if (r2.OooO0o0(r1, r4, r12) == r0) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        ArrayList arrayList2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f93956OooOo;
        C27004OooOO0o c27004OooOO0o = this.f93959OooOoO0;
        String str = this.f93958OooOoO;
        InterfaceC34994oOooo0o interfaceC34994oOooo0o = c27004OooOO0o.f93961OooO00o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f93956OooOo = 1;
            obj = interfaceC34994oOooo0o.OooO0Oo(str, this);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            arrayList2 = this.f93957OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            if (!arrayList2.isEmpty()) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("AiOcrLocalDataSource");
                c20358OooO00o.OooOO0O("Removing quota records: " + arrayList2, new Object[0]);
                this.f93957OooOo0o = null;
                this.f93956OooOo = 3;
            }
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        ArrayList arrayList3 = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayList = this.f93960OooOoOO;
            if (!zHasNext) {
                break;
            }
            Object next = it.next();
            NoteinAiQuotaRecordEntityV2 noteinAiQuotaRecordEntityV2 = (NoteinAiQuotaRecordEntityV2) next;
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(((NoteinAiQuotaRecordEntityV2) it2.next()).getId(), noteinAiQuotaRecordEntityV2.getId())) {
                        break;
                    }
                }
            }
            arrayList3.add(next);
        }
        ArrayList arrayList4 = new ArrayList(C34428OooOOo.OooOOoo(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((NoteinAiQuotaRecordEntityV2) it3.next()).getId());
        }
        NoteinAiQuotaRecordEntityV2[] noteinAiQuotaRecordEntityV2Arr = (NoteinAiQuotaRecordEntityV2[]) arrayList.toArray(new NoteinAiQuotaRecordEntityV2[0]);
        NoteinAiQuotaRecordEntityV2[] noteinAiQuotaRecordEntityV2Arr2 = (NoteinAiQuotaRecordEntityV2[]) Arrays.copyOf(noteinAiQuotaRecordEntityV2Arr, noteinAiQuotaRecordEntityV2Arr.length);
        this.f93957OooOo0o = arrayList4;
        this.f93956OooOo = 2;
        if (interfaceC34994oOooo0o.OooO0o(noteinAiQuotaRecordEntityV2Arr2, this) != enumC32485OooO00o) {
            arrayList2 = arrayList4;
            if (!arrayList2.isEmpty()) {
            }
            return C32460OooOooO.f116667OooO00o;
        }
        return enumC32485OooO00o;
    }
}
