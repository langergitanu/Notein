package o0OoO0oo;

import OooO0o.C20424OooO0Oo;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.orion.notein.domain.models.cache.PageGridModificationRecord;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.page.HyperLink;
import com.orion.notein.domain.models.page.Image;
import com.orion.notein.domain.models.page.PageGrid;
import com.orion.notein.domain.models.page.Shape;
import com.orion.notein.domain.models.page.Stroke;
import com.orion.notein.domain.models.page.TextBox;
import com.orion.notein.p607ui.noteeditor.C23344OooOOo;
import com.orion.penkit.models.DrawRecord;
import com.orion.penkit.models.HyperLinkInfo;
import com.orion.penkit.models.ImageInfo;
import com.orion.penkit.models.InkStrokeInfo;
import com.orion.penkit.models.QuoteInfo;
import com.orion.penkit.models.ShapeInfo;
import com.orion.penkit.models.TextBoxInfo;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import o0O0oooO.C26264OooOOO0;
import o0OO00o0.C26588o00O00oO;
import o0OO00o0.C26596o00O0o0;
import o0OO00o0.C26642o00Ooo00;
import o0OO00o0.C26647o00OooOO;
import o0OO00o0.C26649o00OoooO;
import o0OO00o0.C26676o00o0o00;
import o0OOo0Oo.InterfaceC27301OooOOo;
import o0OOo0Oo.InterfaceC27323Oooo0oO;
import o0oo000O.C31192OooOOOo;
import o0oo0o.InterfaceC31284OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooOO.C32465OooO0O0;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0OoO0oo.o00oOo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorViewModel$updatePage$2", m80623f = "NoteEditorViewModel.kt", m80624l = {1178, 1182, 1210, 1214, 1236, 1240, 1265, 1269, 1275, 1294, 1298, 1336, 1339}, m80625m = "invokeSuspend")
public final class C28956o00oOo00 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Map f102601OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f102602OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public long f102603OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public AbstractList f102604OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f102605OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ List<InterfaceC31284OooO0O0> f102606OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ List<InterfaceC31284OooO0O0> f102607OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ C23344OooOOo f102608OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final /* synthetic */ String f102609OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final /* synthetic */ boolean f102610Oooo000;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C28956o00oOo00(List<? extends InterfaceC31284OooO0O0> list, List<? extends InterfaceC31284OooO0O0> list2, C23344OooOOo c23344OooOOo, String str, boolean z, Continuation<? super C28956o00oOo00> continuation) {
        super(2, continuation);
        this.f102607OooOoo0 = list;
        this.f102606OooOoo = list2;
        this.f102608OooOooO = c23344OooOOo;
        this.f102609OooOooo = str;
        this.f102610Oooo000 = z;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28956o00oOo00(this.f102607OooOoo0, this.f102606OooOoo, this.f102608OooOooO, this.f102609OooOooo, this.f102610Oooo000, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28956o00oOo00) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x04b0, code lost:
    
        if (r4.OooO0O0(r3, r7, r12, r48) == r6) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x05be, code lost:
    
        if (r3.OooO0O0(r1, r4, r12, r48) == r6) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0713, code lost:
    
        if (r1.OooO0O0(r4, r3, r48) == r6) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0732, code lost:
    
        if (r1.OooO0Oo(r0, r3, r48) == r6) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x07ca, code lost:
    
        if (r1 == r6) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x07e3, code lost:
    
        if (com.orion.notein.p607ui.noteeditor.C23344OooOOo.OooO0oo(r48.f102608OooOooO, r48.f102609OooOooo, r2, r4, r48) == r6) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x03bf, code lost:
    
        if (r1.OooO0O0(r3, r4, r12, r48) == r6) goto L243;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0402 A[PHI: r10 r15 r29 r30
      0x0402: PHI (r10v10 java.util.Map) = (r10v5 java.util.Map), (r10v12 java.util.Map) binds: [B:99:0x03c5, B:110:0x03fe] A[DONT_GENERATE, DONT_INLINE]
      0x0402: PHI (r15v14 java.util.Map) = (r15v10 java.util.Map), (r15v15 java.util.Map) binds: [B:99:0x03c5, B:110:0x03fe] A[DONT_GENERATE, DONT_INLINE]
      0x0402: PHI (r29v10 java.util.List<o0oo0o.OooO0O0>) = (r29v7 java.util.List<o0oo0o.OooO0O0>), (r29v11 java.util.List<o0oo0o.OooO0O0>) binds: [B:99:0x03c5, B:110:0x03fe] A[DONT_GENERATE, DONT_INLINE]
      0x0402: PHI (r30v10 java.util.List<o0oo0o.OooO0O0>) = (r30v7 java.util.List<o0oo0o.OooO0O0>), (r30v11 java.util.List<o0oo0o.OooO0O0>) binds: [B:99:0x03c5, B:110:0x03fe] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x04b6 A[PHI: r0 r10 r15 r29 r30
      0x04b6: PHI (r0v54 java.util.AbstractList) = (r0v45 java.util.AbstractList), (r0v61 java.util.AbstractList) binds: [B:126:0x0495, B:130:0x04b4] A[DONT_GENERATE, DONT_INLINE]
      0x04b6: PHI (r10v15 java.util.Map) = (r10v10 java.util.Map), (r10v18 java.util.Map) binds: [B:126:0x0495, B:130:0x04b4] A[DONT_GENERATE, DONT_INLINE]
      0x04b6: PHI (r15v16 java.util.Map) = (r15v14 java.util.Map), (r15v17 java.util.Map) binds: [B:126:0x0495, B:130:0x04b4] A[DONT_GENERATE, DONT_INLINE]
      0x04b6: PHI (r29v13 java.util.List<o0oo0o.OooO0O0>) = (r29v10 java.util.List<o0oo0o.OooO0O0>), (r29v14 java.util.List<o0oo0o.OooO0O0>) binds: [B:126:0x0495, B:130:0x04b4] A[DONT_GENERATE, DONT_INLINE]
      0x04b6: PHI (r30v13 java.util.List<o0oo0o.OooO0O0>) = (r30v10 java.util.List<o0oo0o.OooO0O0>), (r30v14 java.util.List<o0oo0o.OooO0O0>) binds: [B:126:0x0495, B:130:0x04b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x05c4 A[PHI: r0 r8 r10 r29 r30
      0x05c4: PHI (r0v79 java.util.AbstractList) = (r0v70 java.util.AbstractList), (r0v85 java.util.AbstractList) binds: [B:159:0x05a2, B:163:0x05c2] A[DONT_GENERATE, DONT_INLINE]
      0x05c4: PHI (r8v29 java.util.Map) = (r8v27 java.util.Map), (r8v32 java.util.Map) binds: [B:159:0x05a2, B:163:0x05c2] A[DONT_GENERATE, DONT_INLINE]
      0x05c4: PHI (r10v25 java.util.Map) = (r10v21 java.util.Map), (r10v26 java.util.Map) binds: [B:159:0x05a2, B:163:0x05c2] A[DONT_GENERATE, DONT_INLINE]
      0x05c4: PHI (r29v19 java.util.List<o0oo0o.OooO0O0>) = (r29v16 java.util.List<o0oo0o.OooO0O0>), (r29v20 java.util.List<o0oo0o.OooO0O0>) binds: [B:159:0x05a2, B:163:0x05c2] A[DONT_GENERATE, DONT_INLINE]
      0x05c4: PHI (r30v19 java.util.List<o0oo0o.OooO0O0>) = (r30v16 java.util.List<o0oo0o.OooO0O0>), (r30v20 java.util.List<o0oo0o.OooO0O0>) binds: [B:159:0x05a2, B:163:0x05c2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0632  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x066e A[PHI: r0 r8 r29 r30
      0x066e: PHI (r0v91 java.util.Map) = (r0v119 java.util.Map), (r0v120 java.util.Map) binds: [B:198:0x066a, B:10:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x066e: PHI (r8v39 java.util.Map) = (r8v44 java.util.Map), (r8v45 java.util.Map) binds: [B:198:0x066a, B:10:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x066e: PHI (r29v25 java.util.List<o0oo0o.OooO0O0>) = (r29v22 java.util.List<o0oo0o.OooO0O0>), (r29v26 java.util.List<o0oo0o.OooO0O0>) binds: [B:198:0x066a, B:10:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x066e: PHI (r30v25 java.util.List<o0oo0o.OooO0O0>) = (r30v22 java.util.List<o0oo0o.OooO0O0>), (r30v26 java.util.List<o0oo0o.OooO0O0>) binds: [B:198:0x066a, B:10:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x067d  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x06fb  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x06fe  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0719 A[PHI: r0 r29 r30
      0x0719: PHI (r0v101 java.util.List) = (r0v95 java.util.List), (r0v103 java.util.List) binds: [B:215:0x06fc, B:219:0x0717] A[DONT_GENERATE, DONT_INLINE]
      0x0719: PHI (r29v27 java.util.List<o0oo0o.OooO0O0>) = (r29v25 java.util.List<o0oo0o.OooO0O0>), (r29v28 java.util.List<o0oo0o.OooO0O0>) binds: [B:215:0x06fc, B:219:0x0717] A[DONT_GENERATE, DONT_INLINE]
      0x0719: PHI (r30v27 java.util.List<o0oo0o.OooO0O0>) = (r30v25 java.util.List<o0oo0o.OooO0O0>), (r30v28 java.util.List<o0oo0o.OooO0O0>) binds: [B:215:0x06fc, B:219:0x0717] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x071b  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0738 A[PHI: r29 r30
      0x0738: PHI (r29v30 java.util.List<o0oo0o.OooO0O0>) = (r29v27 java.util.List<o0oo0o.OooO0O0>), (r29v31 java.util.List<o0oo0o.OooO0O0>) binds: [B:220:0x0719, B:224:0x0736] A[DONT_GENERATE, DONT_INLINE]
      0x0738: PHI (r30v30 java.util.List<o0oo0o.OooO0O0>) = (r30v27 java.util.List<o0oo0o.OooO0O0>), (r30v31 java.util.List<o0oo0o.OooO0O0>) binds: [B:220:0x0719, B:224:0x0736] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0769  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03c5 A[PHI: r0 r10 r15 r29 r30
      0x03c5: PHI (r0v29 java.util.AbstractList) = (r0v21 java.util.AbstractList), (r0v36 java.util.AbstractList) binds: [B:94:0x03a3, B:98:0x03c3] A[DONT_GENERATE, DONT_INLINE]
      0x03c5: PHI (r10v5 java.util.Map) = (r10v3 java.util.Map), (r10v7 java.util.Map) binds: [B:94:0x03a3, B:98:0x03c3] A[DONT_GENERATE, DONT_INLINE]
      0x03c5: PHI (r15v10 java.util.Map) = (r15v7 java.util.Map), (r15v11 java.util.Map) binds: [B:94:0x03a3, B:98:0x03c3] A[DONT_GENERATE, DONT_INLINE]
      0x03c5: PHI (r29v7 java.util.List<o0oo0o.OooO0O0>) = (r29v5 java.util.List<o0oo0o.OooO0O0>), (r29v8 java.util.List<o0oo0o.OooO0O0>) binds: [B:94:0x03a3, B:98:0x03c3] A[DONT_GENERATE, DONT_INLINE]
      0x03c5: PHI (r30v7 java.util.List<o0oo0o.OooO0O0>) = (r30v5 java.util.List<o0oo0o.OooO0O0>), (r30v8 java.util.List<o0oo0o.OooO0O0>) binds: [B:94:0x03a3, B:98:0x03c3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r1v67, types: [o0OOo0Oo.Oooo00O] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
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
        List<InterfaceC31284OooO0O0> list;
        ArrayList arrayList2;
        List<InterfaceC31284OooO0O0> list2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        AbstractList abstractList;
        Map map;
        Map map2;
        InterfaceC27323Oooo0oO interfaceC27323Oooo0oO;
        String str;
        int i;
        Map map3;
        Map map4;
        List list3;
        ArrayList arrayList5;
        List list4;
        AbstractList abstractList2;
        Map map5;
        Map map6;
        List list5;
        ArrayList arrayList6;
        List list6;
        AbstractList abstractList3;
        Map map7;
        Map map8;
        Map map9;
        Map map10;
        List list7;
        ArrayList arrayList7;
        List list8;
        AbstractList abstractList4;
        Map map11;
        Map map12;
        Map map13;
        Map map14;
        List list9;
        ?? arrayList8;
        List list10;
        ArrayList arrayList9;
        List list11;
        Map map15;
        Map map16;
        List list12;
        ArrayList arrayList10;
        List list13;
        List list14;
        NoteContent noteContent;
        RectF rectFOooO00o;
        long j;
        ?? OooO0oO2;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = this.f102605OooOoOO;
        String str2 = this.f102609OooOooo;
        List<InterfaceC31284OooO0O0> list15 = this.f102606OooOoo;
        List<InterfaceC31284OooO0O0> list16 = this.f102607OooOoo0;
        boolean z = this.f102610Oooo000;
        C23344OooOOo c23344OooOOo = this.f102608OooOooO;
        switch (i2) {
            case 0:
                C32446OooOOOo.OooO0O0(obj);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj3 : list16) {
                    Integer num = new Integer(((InterfaceC31284OooO0O0) obj3).getItemType());
                    Object arrayList11 = linkedHashMap.get(num);
                    if (arrayList11 == null) {
                        arrayList11 = new ArrayList();
                        linkedHashMap.put(num, arrayList11);
                    }
                    ((List) arrayList11).add(obj3);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Object obj4 : list15) {
                    Integer num2 = new Integer(((InterfaceC31284OooO0O0) obj4).getItemType());
                    Object arrayList12 = linkedHashMap2.get(num2);
                    if (arrayList12 == null) {
                        arrayList12 = new ArrayList();
                        linkedHashMap2.put(num2, arrayList12);
                    }
                    ((List) arrayList12).add(obj4);
                }
                C32465OooO0O0 c32465OooO0O0OooO0Oo = com.facebook.soloader.OooOo.OooO0Oo();
                List list17 = (List) C20424OooO0Oo.OooO0Oo(0, linkedHashMap);
                String str3 = this.f102609OooOooo;
                if (list17 != null) {
                    List<InterfaceC31284OooO0O0> list18 = list17;
                    arrayList = new ArrayList(C34428OooOOo.OooOOoo(list18, 10));
                    for (InterfaceC31284OooO0O0 interfaceC31284OooO0O0 : list18) {
                        kotlin.jvm.internal.OooOOO0.OooO0o0(interfaceC31284OooO0O0, "null cannot be cast to non-null type com.orion.penkit.models.DrawRecord");
                        DrawRecord drawRecord = (DrawRecord) interfaceC31284OooO0O0;
                        String str4 = str3;
                        arrayList.add(new Stroke(drawRecord.getId(), str4, drawRecord.getLayerId(), drawRecord.getCreationTime(), drawRecord, null, 32, null));
                        str3 = str4;
                    }
                } else {
                    arrayList = null;
                }
                String str5 = str3;
                List list19 = (List) C20424OooO0Oo.OooO0Oo(9, linkedHashMap);
                if (list19 != null) {
                    List<InterfaceC31284OooO0O0> list20 = list19;
                    list = list15;
                    arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list20, 10));
                    for (InterfaceC31284OooO0O0 interfaceC31284OooO0O02 : list20) {
                        kotlin.jvm.internal.OooOOO0.OooO0o0(interfaceC31284OooO0O02, "null cannot be cast to non-null type com.orion.penkit.models.InkStrokeInfo");
                        InkStrokeInfo inkStrokeInfo = (InkStrokeInfo) interfaceC31284OooO0O02;
                        arrayList2.add(new Stroke(inkStrokeInfo.getId(), str5, inkStrokeInfo.getLayerId(), inkStrokeInfo.getCreationTime(), null, inkStrokeInfo, 16, null));
                    }
                } else {
                    list = list15;
                    arrayList2 = null;
                }
                if (arrayList != null) {
                    c32465OooO0O0OooO0Oo.addAll(arrayList);
                }
                if (arrayList2 != null) {
                    c32465OooO0O0OooO0Oo.addAll(arrayList2);
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                }
                C32465OooO0O0 c32465OooO0O0OooO0O0 = com.facebook.soloader.OooOo.OooO0O0(c32465OooO0O0OooO0Oo);
                C32465OooO0O0 c32465OooO0O0OooO0Oo2 = com.facebook.soloader.OooOo.OooO0Oo();
                List list21 = (List) C20424OooO0Oo.OooO0Oo(0, linkedHashMap2);
                String str6 = this.f102609OooOooo;
                if (list21 != null) {
                    List<InterfaceC31284OooO0O0> list22 = list21;
                    list2 = list16;
                    arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(list22, 10));
                    for (InterfaceC31284OooO0O0 interfaceC31284OooO0O03 : list22) {
                        kotlin.jvm.internal.OooOOO0.OooO0o0(interfaceC31284OooO0O03, "null cannot be cast to non-null type com.orion.penkit.models.DrawRecord");
                        DrawRecord drawRecord2 = (DrawRecord) interfaceC31284OooO0O03;
                        arrayList3.add(new Stroke(drawRecord2.getId(), str6, drawRecord2.getLayerId(), drawRecord2.getCreationTime(), drawRecord2, null, 32, null));
                    }
                } else {
                    list2 = list16;
                    arrayList3 = null;
                }
                List list23 = (List) C20424OooO0Oo.OooO0Oo(9, linkedHashMap2);
                if (list23 != null) {
                    List<InterfaceC31284OooO0O0> list24 = list23;
                    arrayList4 = new ArrayList(C34428OooOOo.OooOOoo(list24, 10));
                    for (InterfaceC31284OooO0O0 interfaceC31284OooO0O04 : list24) {
                        kotlin.jvm.internal.OooOOO0.OooO0o0(interfaceC31284OooO0O04, "null cannot be cast to non-null type com.orion.penkit.models.InkStrokeInfo");
                        InkStrokeInfo inkStrokeInfo2 = (InkStrokeInfo) interfaceC31284OooO0O04;
                        arrayList4.add(new Stroke(inkStrokeInfo2.getId(), str6, inkStrokeInfo2.getLayerId(), inkStrokeInfo2.getCreationTime(), null, inkStrokeInfo2, 16, null));
                    }
                } else {
                    arrayList4 = null;
                }
                if (arrayList3 != null) {
                    c32465OooO0O0OooO0Oo2.addAll(arrayList3);
                }
                if (arrayList4 != null) {
                    c32465OooO0O0OooO0Oo2.addAll(arrayList4);
                    C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                }
                C32465OooO0O0 c32465OooO0O0OooO0O02 = com.facebook.soloader.OooOo.OooO0O0(c32465OooO0O0OooO0Oo2);
                InterfaceC27323Oooo0oO interfaceC27323Oooo0oO2 = c23344OooOOo.f73555OooOOOO;
                String str7 = (String) c23344OooOOo.f73589OoooOOo.getValue();
                this.f102602OooOo0o = linkedHashMap;
                this.f102601OooOo = linkedHashMap2;
                this.f102604OooOoO0 = c32465OooO0O0OooO0O02;
                this.f102605OooOoOO = 1;
                if (interfaceC27323Oooo0oO2.OooO0o(c32465OooO0O0OooO0O0, str7, z, this) != obj2) {
                    abstractList = c32465OooO0O0OooO0O02;
                    map2 = linkedHashMap;
                    map = linkedHashMap2;
                    interfaceC27323Oooo0oO = c23344OooOOo.f73555OooOOOO;
                    str = (String) c23344OooOOo.f73589OoooOOo.getValue();
                    this.f102602OooOo0o = map2;
                    this.f102601OooOo = map;
                    this.f102604OooOoO0 = null;
                    i = 2;
                    this.f102605OooOoOO = 2;
                    if (interfaceC27323Oooo0oO.OooO0Oo(abstractList, str, this) != obj2) {
                        map3 = map;
                        map4 = map2;
                        list3 = (List) map4.get(new Integer(i));
                        if (list3 == null) {
                            List<InterfaceC31284OooO0O0> list25 = list3;
                            arrayList5 = new ArrayList(C34428OooOOo.OooOOoo(list25, 10));
                            for (InterfaceC31284OooO0O0 interfaceC31284OooO0O05 : list25) {
                                kotlin.jvm.internal.OooOOO0.OooO0o0(interfaceC31284OooO0O05, "null cannot be cast to non-null type com.orion.penkit.models.ShapeInfo");
                                ShapeInfo shapeInfo = (ShapeInfo) interfaceC31284OooO0O05;
                                arrayList5.add(new Shape(shapeInfo.getId(), this.f102609OooOooo, shapeInfo.getColor(), shapeInfo.getWidth(), shapeInfo.getPoints(), shapeInfo.getType(), shapeInfo.getBlendMode(), shapeInfo.getStyle(), shapeInfo.getTapeLike(), shapeInfo.getOpacityOfFillColor(), shapeInfo.getLayerId(), shapeInfo.getCreationTime()));
                            }
                        } else {
                            arrayList5 = null;
                        }
                        list4 = (List) map3.get(new Integer(2));
                        if (list4 == null) {
                            List<InterfaceC31284OooO0O0> list26 = list4;
                            ArrayList arrayList13 = new ArrayList(C34428OooOOo.OooOOoo(list26, 10));
                            for (InterfaceC31284OooO0O0 interfaceC31284OooO0O06 : list26) {
                                kotlin.jvm.internal.OooOOO0.OooO0o0(interfaceC31284OooO0O06, "null cannot be cast to non-null type com.orion.penkit.models.ShapeInfo");
                                arrayList13.add(((ShapeInfo) interfaceC31284OooO0O06).getId());
                            }
                            abstractList2 = arrayList13;
                        } else {
                            abstractList2 = null;
                        }
                        if (arrayList5 == null) {
                            C26649o00OoooO c26649o00OoooO = c23344OooOOo.f73562OooOo00;
                            String str8 = (String) c23344OooOOo.f73589OoooOOo.getValue();
                            this.f102602OooOo0o = map4;
                            this.f102601OooOo = map3;
                            this.f102604OooOoO0 = abstractList2;
                            this.f102605OooOoOO = 3;
                            map3 = map3;
                            map4 = map4;
                            break;
                        } else if (abstractList2 == null) {
                            C26649o00OoooO c26649o00OoooO2 = c23344OooOOo.f73562OooOo00;
                            String str9 = (String) c23344OooOOo.f73589OoooOOo.getValue();
                            this.f102602OooOo0o = map4;
                            this.f102601OooOo = map3;
                            this.f102604OooOoO0 = null;
                            this.f102605OooOoOO = 4;
                            C26647o00OooOO c26647o00OooOO = c26649o00OoooO2.f91973OooO00o;
                            c26647o00OooOO.getClass();
                            Object objOooO00o = c26647o00OooOO.OooO00o(str9, new C26642o00Ooo00(abstractList2, null));
                            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                            if (objOooO00o != enumC32485OooO00o) {
                                objOooO00o = C32460OooOooO.f116667OooO00o;
                            }
                            if (objOooO00o != enumC32485OooO00o) {
                                objOooO00o = C32460OooOooO.f116667OooO00o;
                            }
                            if (objOooO00o != obj2) {
                                map5 = map3;
                                map6 = map4;
                                C32460OooOooO c32460OooOooO3 = C32460OooOooO.f116667OooO00o;
                                map4 = map6;
                                map3 = map5;
                                list5 = (List) map4.get(new Integer(5));
                                if (list5 != null) {
                                    List<InterfaceC31284OooO0O0> list27 = list5;
                                    arrayList6 = new ArrayList(C34428OooOOo.OooOOoo(list27, 10));
                                    for (InterfaceC31284OooO0O0 interfaceC31284OooO0O07 : list27) {
                                        kotlin.jvm.internal.OooOOO0.OooO0o0(interfaceC31284OooO0O07, "null cannot be cast to non-null type com.orion.penkit.models.ImageInfo");
                                        ImageInfo imageInfo = (ImageInfo) interfaceC31284OooO0O07;
                                        arrayList6.add(new Image(imageInfo.getId(), this.f102609OooOooo, imageInfo.getUri(), imageInfo.getLayerId(), imageInfo.getBounds(), imageInfo.getRotation(), imageInfo.getCreationTime(), System.currentTimeMillis(), imageInfo.getFixed()));
                                    }
                                } else {
                                    arrayList6 = null;
                                }
                                list6 = (List) map3.get(new Integer(5));
                                if (list6 != null) {
                                    List list28 = list6;
                                    ArrayList arrayList14 = new ArrayList(C34428OooOOo.OooOOoo(list28, 10));
                                    Iterator it = list28.iterator();
                                    while (it.hasNext()) {
                                        arrayList14.add(((InterfaceC31284OooO0O0) it.next()).getId());
                                    }
                                    abstractList3 = arrayList14;
                                } else {
                                    abstractList3 = null;
                                }
                                if (arrayList6 != null) {
                                    C26596o00O0o0 c26596o00O0o0 = c23344OooOOo.f73554OooOOO0;
                                    String str10 = (String) c23344OooOOo.f73589OoooOOo.getValue();
                                    this.f102602OooOo0o = map4;
                                    this.f102601OooOo = map3;
                                    this.f102604OooOoO0 = abstractList3;
                                    this.f102605OooOoOO = 5;
                                    map3 = map3;
                                    map4 = map4;
                                    break;
                                } else if (abstractList3 == null) {
                                    C26596o00O0o0 c26596o00O0o02 = c23344OooOOo.f73554OooOOO0;
                                    String str11 = (String) c23344OooOOo.f73589OoooOOo.getValue();
                                    this.f102602OooOo0o = map4;
                                    this.f102601OooOo = map3;
                                    this.f102604OooOoO0 = null;
                                    this.f102605OooOoOO = 6;
                                    C26588o00O00oO c26588o00O00oO = c26596o00O0o02.f91720OooO00o;
                                    c26588o00O00oO.getClass();
                                    Object objOooO00o2 = c26588o00O00oO.OooO00o(str11, new o0OO00o0.o0O0ooO(abstractList3, null));
                                    EnumC32485OooO00o enumC32485OooO00o2 = EnumC32485OooO00o.f116726OooOo0o;
                                    if (objOooO00o2 != enumC32485OooO00o2) {
                                        objOooO00o2 = C32460OooOooO.f116667OooO00o;
                                    }
                                    if (objOooO00o2 != enumC32485OooO00o2) {
                                        objOooO00o2 = C32460OooOooO.f116667OooO00o;
                                    }
                                    if (objOooO00o2 != obj2) {
                                        map9 = map3;
                                        map10 = map4;
                                        C32460OooOooO c32460OooOooO4 = C32460OooOooO.f116667OooO00o;
                                        map7 = map9;
                                        map8 = map10;
                                        list7 = (List) map8.get(new Integer(4));
                                        if (list7 != null) {
                                            List<InterfaceC31284OooO0O0> list29 = list7;
                                            arrayList7 = new ArrayList(C34428OooOOo.OooOOoo(list29, 10));
                                            for (InterfaceC31284OooO0O0 interfaceC31284OooO0O08 : list29) {
                                                kotlin.jvm.internal.OooOOO0.OooO0o0(interfaceC31284OooO0O08, "null cannot be cast to non-null type com.orion.penkit.models.TextBoxInfo");
                                                TextBoxInfo textBoxInfo = (TextBoxInfo) interfaceC31284OooO0O08;
                                                arrayList7.add(new TextBox(textBoxInfo.getId(), this.f102609OooOooo, textBoxInfo.getText(), textBoxInfo.getTextSize(), textBoxInfo.getBoxWidth(), textBoxInfo.getBoxHeight(), textBoxInfo.getBounds(), textBoxInfo.getLineHeight(), textBoxInfo.getBackgroundColor(), textBoxInfo.getLayerId(), textBoxInfo.getCreationTime(), 0, new Matrix(textBoxInfo.getLocalTransform()), 2048, null));
                                            }
                                        } else {
                                            arrayList7 = null;
                                        }
                                        list8 = (List) map7.get(new Integer(4));
                                        if (list8 != null) {
                                            List list30 = list8;
                                            ArrayList arrayList15 = new ArrayList(C34428OooOOo.OooOOoo(list30, 10));
                                            Iterator it2 = list30.iterator();
                                            while (it2.hasNext()) {
                                                arrayList15.add(((InterfaceC31284OooO0O0) it2.next()).getId());
                                            }
                                            abstractList4 = arrayList15;
                                        } else {
                                            abstractList4 = null;
                                        }
                                        if (arrayList7 != null) {
                                            C26264OooOOO0 c26264OooOOO0 = c23344OooOOo.f73553OooOOO;
                                            String str12 = (String) c23344OooOOo.f73589OoooOOo.getValue();
                                            this.f102602OooOo0o = map8;
                                            this.f102601OooOo = map7;
                                            this.f102604OooOoO0 = abstractList4;
                                            this.f102605OooOoOO = 7;
                                            map7 = map7;
                                            map8 = map8;
                                            break;
                                        } else if (abstractList4 == null) {
                                            C26264OooOOO0 c26264OooOOO02 = c23344OooOOo.f73553OooOOO;
                                            String str13 = (String) c23344OooOOo.f73589OoooOOo.getValue();
                                            this.f102602OooOo0o = map8;
                                            this.f102601OooOo = map7;
                                            this.f102604OooOoO0 = null;
                                            this.f102605OooOoOO = 8;
                                            Object objOooO00o3 = ((C26676o00o0o00) c26264OooOOO02.f89720OooO00o).OooO00o(str13, abstractList4, this);
                                            if (objOooO00o3 != EnumC32485OooO00o.f116726OooOo0o) {
                                                objOooO00o3 = C32460OooOooO.f116667OooO00o;
                                            }
                                            if (objOooO00o3 != obj2) {
                                                map13 = map7;
                                                map14 = map8;
                                                C32460OooOooO c32460OooOooO5 = C32460OooOooO.f116667OooO00o;
                                                map11 = map13;
                                                map12 = map14;
                                                list9 = (List) map12.get(new Integer(3));
                                                if (list9 != null) {
                                                    arrayList8 = new ArrayList();
                                                    for (Object obj5 : list9) {
                                                        if (obj5 instanceof QuoteInfo) {
                                                            arrayList8.add(obj5);
                                                        }
                                                    }
                                                } else {
                                                    arrayList8 = 0;
                                                }
                                                list10 = (List) map11.get(new Integer(3));
                                                if (list10 != null) {
                                                    arrayList9 = new ArrayList();
                                                    for (Object obj6 : list10) {
                                                        if (obj6 instanceof QuoteInfo) {
                                                            arrayList9.add(obj6);
                                                        }
                                                    }
                                                } else {
                                                    arrayList9 = null;
                                                }
                                                C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
                                                list11 = arrayList9;
                                                if (arrayList9 == null) {
                                                    list11 = c34434OooOoO;
                                                }
                                                if (arrayList8 == 0) {
                                                    arrayList8 = c34434OooOoO;
                                                }
                                                this.f102602OooOo0o = map12;
                                                this.f102601OooOo = map11;
                                                this.f102604OooOoO0 = null;
                                                this.f102605OooOoOO = 9;
                                                map16 = map11;
                                                map15 = map12;
                                                if (C23344OooOOo.OooO0o(c23344OooOOo, str2, list11, arrayList8, this) != obj2) {
                                                    list12 = (List) map15.get(new Integer(8));
                                                    if (list12 == null) {
                                                        List<InterfaceC31284OooO0O0> list31 = list12;
                                                        arrayList10 = new ArrayList(C34428OooOOo.OooOOoo(list31, 10));
                                                        for (InterfaceC31284OooO0O0 interfaceC31284OooO0O09 : list31) {
                                                            kotlin.jvm.internal.OooOOO0.OooO0o0(interfaceC31284OooO0O09, "null cannot be cast to non-null type com.orion.penkit.models.HyperLinkInfo");
                                                            HyperLinkInfo hyperLinkInfo = (HyperLinkInfo) interfaceC31284OooO0O09;
                                                            arrayList10.add(new HyperLink(hyperLinkInfo.getId(), this.f102609OooOooo, hyperLinkInfo.getType(), hyperLinkInfo.getDestination(), hyperLinkInfo.getExtras(), hyperLinkInfo.getBounds(), hyperLinkInfo.getCreationTime()));
                                                        }
                                                    } else {
                                                        arrayList10 = null;
                                                    }
                                                    list13 = (List) map16.get(new Integer(8));
                                                    if (list13 == null) {
                                                        List list32 = list13;
                                                        ArrayList arrayList16 = new ArrayList(C34428OooOOo.OooOOoo(list32, 10));
                                                        Iterator it3 = list32.iterator();
                                                        while (it3.hasNext()) {
                                                            arrayList16.add(((InterfaceC31284OooO0O0) it3.next()).getId());
                                                        }
                                                        list14 = arrayList16;
                                                    } else {
                                                        list14 = null;
                                                    }
                                                    if (arrayList10 == null) {
                                                        InterfaceC27301OooOOo interfaceC27301OooOOo = c23344OooOOo.f73564OooOo0o;
                                                        String str14 = (String) c23344OooOOo.f73589OoooOOo.getValue();
                                                        this.f102602OooOo0o = list14;
                                                        this.f102601OooOo = null;
                                                        this.f102605OooOoOO = 10;
                                                    } else if (list14 == null) {
                                                        InterfaceC27301OooOOo interfaceC27301OooOOo2 = c23344OooOOo.f73564OooOo0o;
                                                        String str15 = (String) c23344OooOOo.f73589OoooOOo.getValue();
                                                        this.f102602OooOo0o = null;
                                                        this.f102601OooOo = null;
                                                        this.f102605OooOoOO = 11;
                                                    } else {
                                                        noteContent = (NoteContent) c23344OooOOo.f73592OoooOoo.f121747OooOo0o.getValue();
                                                        long jCurrentTimeMillis = System.currentTimeMillis();
                                                        C32465OooO0O0 c32465OooO0O0OooO0Oo3 = com.facebook.soloader.OooOo.OooO0Oo();
                                                        c32465OooO0O0OooO0Oo3.addAll(list2);
                                                        c32465OooO0O0OooO0Oo3.addAll(list);
                                                        C32465OooO0O0 c32465OooO0O0OooO0O03 = com.facebook.soloader.OooOo.OooO0O0(c32465OooO0O0OooO0Oo3);
                                                        InterfaceC31284OooO0O0.f111702OooO0O0.getClass();
                                                        rectFOooO00o = InterfaceC31284OooO0O0.OooO00o.OooO00o(1.0f, c32465OooO0O0OooO0O03);
                                                        if (rectFOooO00o != null) {
                                                            if (noteContent.getUnboundedNote()) {
                                                                ArrayList<PageGrid> arrayListOooO0OO = C31192OooOOOo.OooO0OO(str2, rectFOooO00o);
                                                                OooO0oO2 = new ArrayList(C34428OooOOo.OooOOoo(arrayListOooO0OO, 10));
                                                                for (PageGrid pageGrid : arrayListOooO0OO) {
                                                                    OooO0oO2.add(new PageGridModificationRecord(this.f102609OooOooo, pageGrid.getIndex().x, pageGrid.getIndex().y, jCurrentTimeMillis));
                                                                }
                                                            } else {
                                                                OooO0oO2 = com.facebook.soloader.OooOo.OooO0oO(new PageGridModificationRecord(this.f102609OooOooo, 0, 0, jCurrentTimeMillis));
                                                            }
                                                            this.f102602OooOo0o = noteContent;
                                                            this.f102601OooOo = null;
                                                            this.f102603OooOoO = jCurrentTimeMillis;
                                                            this.f102605OooOoOO = 12;
                                                            Object objOooO00o4 = c23344OooOOo.f73544OooO.f96584OooOO0.OooO00o(OooO0oO2, this);
                                                            if (objOooO00o4 != EnumC32485OooO00o.f116726OooOo0o) {
                                                                objOooO00o4 = C32460OooOooO.f116667OooO00o;
                                                            }
                                                        }
                                                        j = jCurrentTimeMillis;
                                                        String id = noteContent.getId();
                                                        this.f102602OooOo0o = null;
                                                        this.f102601OooOo = null;
                                                        this.f102605OooOoOO = 13;
                                                    }
                                                }
                                            }
                                            break;
                                        } else {
                                            map11 = map7;
                                            map12 = map8;
                                            list9 = (List) map12.get(new Integer(3));
                                            if (list9 != null) {
                                            }
                                            list10 = (List) map11.get(new Integer(3));
                                            if (list10 != null) {
                                            }
                                            C34434OooOoO c34434OooOoO2 = C34434OooOoO.f123453OooOo0o;
                                            list11 = arrayList9;
                                            if (arrayList9 == null) {
                                            }
                                            if (arrayList8 == 0) {
                                            }
                                            this.f102602OooOo0o = map12;
                                            this.f102601OooOo = map11;
                                            this.f102604OooOoO0 = null;
                                            this.f102605OooOoOO = 9;
                                            map16 = map11;
                                            map15 = map12;
                                            if (C23344OooOOo.OooO0o(c23344OooOOo, str2, list11, arrayList8, this) != obj2) {
                                            }
                                        }
                                    }
                                } else {
                                    map7 = map3;
                                    map8 = map4;
                                    list7 = (List) map8.get(new Integer(4));
                                    if (list7 != null) {
                                    }
                                    list8 = (List) map7.get(new Integer(4));
                                    if (list8 != null) {
                                    }
                                    if (arrayList7 != null) {
                                    }
                                }
                            }
                        } else {
                            list5 = (List) map4.get(new Integer(5));
                            if (list5 != null) {
                            }
                            list6 = (List) map3.get(new Integer(5));
                            if (list6 != null) {
                            }
                            if (arrayList6 != null) {
                            }
                        }
                    }
                }
                return obj2;
            case 1:
                abstractList = this.f102604OooOoO0;
                Map map17 = this.f102601OooOo;
                Map map18 = (Map) this.f102602OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                list = list15;
                list2 = list16;
                map2 = map18;
                map = map17;
                interfaceC27323Oooo0oO = c23344OooOOo.f73555OooOOOO;
                str = (String) c23344OooOOo.f73589OoooOOo.getValue();
                this.f102602OooOo0o = map2;
                this.f102601OooOo = map;
                this.f102604OooOoO0 = null;
                i = 2;
                this.f102605OooOoOO = 2;
                if (interfaceC27323Oooo0oO.OooO0Oo(abstractList, str, this) != obj2) {
                }
                return obj2;
            case 2:
                Map map19 = this.f102601OooOo;
                Map map20 = (Map) this.f102602OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                map3 = map19;
                list = list15;
                list2 = list16;
                i = 2;
                map4 = map20;
                list3 = (List) map4.get(new Integer(i));
                if (list3 == null) {
                }
                list4 = (List) map3.get(new Integer(2));
                if (list4 == null) {
                }
                if (arrayList5 == null) {
                }
                return obj2;
            case 3:
                abstractList2 = this.f102604OooOoO0;
                Map map21 = this.f102601OooOo;
                Map map22 = (Map) this.f102602OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                list = list15;
                list2 = list16;
                map3 = map21;
                map4 = map22;
                C32460OooOooO c32460OooOooO6 = C32460OooOooO.f116667OooO00o;
                if (abstractList2 == null) {
                }
                return obj2;
            case 4:
                Map map23 = this.f102601OooOo;
                Map map24 = (Map) this.f102602OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                list = list15;
                list2 = list16;
                map5 = map23;
                map6 = map24;
                C32460OooOooO c32460OooOooO32 = C32460OooOooO.f116667OooO00o;
                map4 = map6;
                map3 = map5;
                list5 = (List) map4.get(new Integer(5));
                if (list5 != null) {
                }
                list6 = (List) map3.get(new Integer(5));
                if (list6 != null) {
                }
                if (arrayList6 != null) {
                }
                return obj2;
            case 5:
                abstractList3 = this.f102604OooOoO0;
                Map map25 = this.f102601OooOo;
                Map map26 = (Map) this.f102602OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                list = list15;
                list2 = list16;
                map3 = map25;
                map4 = map26;
                C32460OooOooO c32460OooOooO7 = C32460OooOooO.f116667OooO00o;
                if (abstractList3 == null) {
                }
                break;
            case 6:
                Map map27 = this.f102601OooOo;
                Map map28 = (Map) this.f102602OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                list = list15;
                list2 = list16;
                map9 = map27;
                map10 = map28;
                C32460OooOooO c32460OooOooO42 = C32460OooOooO.f116667OooO00o;
                map7 = map9;
                map8 = map10;
                list7 = (List) map8.get(new Integer(4));
                if (list7 != null) {
                }
                list8 = (List) map7.get(new Integer(4));
                if (list8 != null) {
                }
                if (arrayList7 != null) {
                }
                return obj2;
            case 7:
                abstractList4 = this.f102604OooOoO0;
                Map map29 = this.f102601OooOo;
                Map map30 = (Map) this.f102602OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                list = list15;
                list2 = list16;
                map7 = map29;
                map8 = map30;
                C32460OooOooO c32460OooOooO8 = C32460OooOooO.f116667OooO00o;
                if (abstractList4 == null) {
                }
                break;
            case 8:
                Map map31 = this.f102601OooOo;
                Map map32 = (Map) this.f102602OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                list = list15;
                list2 = list16;
                map13 = map31;
                map14 = map32;
                C32460OooOooO c32460OooOooO52 = C32460OooOooO.f116667OooO00o;
                map11 = map13;
                map12 = map14;
                list9 = (List) map12.get(new Integer(3));
                if (list9 != null) {
                }
                list10 = (List) map11.get(new Integer(3));
                if (list10 != null) {
                }
                C34434OooOoO c34434OooOoO22 = C34434OooOoO.f123453OooOo0o;
                list11 = arrayList9;
                if (arrayList9 == null) {
                }
                if (arrayList8 == 0) {
                }
                this.f102602OooOo0o = map12;
                this.f102601OooOo = map11;
                this.f102604OooOoO0 = null;
                this.f102605OooOoOO = 9;
                map16 = map11;
                map15 = map12;
                if (C23344OooOOo.OooO0o(c23344OooOOo, str2, list11, arrayList8, this) != obj2) {
                }
                return obj2;
            case 9:
                Map map33 = this.f102601OooOo;
                Map map34 = (Map) this.f102602OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                list = list15;
                list2 = list16;
                map16 = map33;
                map15 = map34;
                list12 = (List) map15.get(new Integer(8));
                if (list12 == null) {
                }
                list13 = (List) map16.get(new Integer(8));
                if (list13 == null) {
                }
                if (arrayList10 == null) {
                }
                return obj2;
            case 10:
                list14 = (List) this.f102602OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                list = list15;
                list2 = list16;
                C32460OooOooO c32460OooOooO9 = C32460OooOooO.f116667OooO00o;
                if (list14 == null) {
                }
                return obj2;
            case 11:
                C32446OooOOOo.OooO0O0(obj);
                list = list15;
                list2 = list16;
                C32460OooOooO c32460OooOooO10 = C32460OooOooO.f116667OooO00o;
                noteContent = (NoteContent) c23344OooOOo.f73592OoooOoo.f121747OooOo0o.getValue();
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                C32465OooO0O0 c32465OooO0O0OooO0Oo32 = com.facebook.soloader.OooOo.OooO0Oo();
                c32465OooO0O0OooO0Oo32.addAll(list2);
                c32465OooO0O0OooO0Oo32.addAll(list);
                C32465OooO0O0 c32465OooO0O0OooO0O032 = com.facebook.soloader.OooOo.OooO0O0(c32465OooO0O0OooO0Oo32);
                InterfaceC31284OooO0O0.f111702OooO0O0.getClass();
                rectFOooO00o = InterfaceC31284OooO0O0.OooO00o.OooO00o(1.0f, c32465OooO0O0OooO0O032);
                if (rectFOooO00o != null) {
                }
                j = jCurrentTimeMillis2;
                String id2 = noteContent.getId();
                this.f102602OooOo0o = null;
                this.f102601OooOo = null;
                this.f102605OooOoOO = 13;
                break;
            case 12:
                j = this.f102603OooOoO;
                noteContent = (NoteContent) this.f102602OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                String id22 = noteContent.getId();
                this.f102602OooOo0o = null;
                this.f102601OooOo = null;
                this.f102605OooOoOO = 13;
                break;
            case 13:
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
