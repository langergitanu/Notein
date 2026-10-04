package o0Oo0OoO;

import Oooo0OO.AbstractC20960OooOOOO;
import android.util.Log;
import com.orion.notein.data.p602db.entity.OutlineEntity;
import com.orion.notein.domain.mapper.OutlineMapper;
import com.orion.notein.domain.models.note.Outline;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import o0OO00o0.C26620o00Oo00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0Oo0OoO.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28119OooOo0 extends AbstractC20960OooOOOO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C26620o00Oo00o f99679OooOo;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final OutlineMapper f99680OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28119OooOo0(C26620o00Oo00o c26620o00Oo00o, OutlineMapper outlineMapper) {
        super(2);
        kotlin.jvm.internal.OooOOO0.OooO0oO(outlineMapper, "outlineMapper");
        this.f99679OooOo = c26620o00Oo00o;
        this.f99680OooOoO0 = outlineMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o00000Oo(String str, Map map, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C28120OooOo00 c28120OooOo00;
        if (abstractC32479OooO0OO instanceof C28120OooOo00) {
            c28120OooOo00 = (C28120OooOo00) abstractC32479OooO0OO;
            int i = c28120OooOo00.f99683OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28120OooOo00.f99683OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c28120OooOo00 = new C28120OooOo00(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c28120OooOo00.f99682OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c28120OooOo00.f99683OooOoO0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                ArrayList arrayListO00000 = o00000(OutlineEntity.class, str + "/outline");
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(arrayListO00000, 10));
                Iterator it = arrayListO00000.iterator();
                while (it.hasNext()) {
                    arrayList.add(this.f99680OooOoO0.toModel((OutlineEntity) it.next()));
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    map.put(((Outline) it2.next()).getId(), UUID.randomUUID().toString());
                }
                ArrayList<Outline> arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (map.containsKey(((Outline) obj2).getPageId())) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Outline outline : arrayList2) {
                    String string = UUID.randomUUID().toString();
                    kotlin.jvm.internal.OooOOO0.OooO0o(string, "toString(...)");
                    String quoteId = outline.getQuoteId();
                    if (quoteId != null) {
                        map.put(quoteId, string);
                    }
                    Object obj3 = map.get(outline.getId());
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(obj3);
                    String str3 = (String) obj3;
                    String str4 = (String) map.get(outline.getParentId());
                    List<String> children = outline.getChildren();
                    ArrayList arrayList4 = new ArrayList();
                    Iterator<T> it3 = children.iterator();
                    while (it3.hasNext()) {
                        String str5 = (String) map.get((String) it3.next());
                        if (str5 != null) {
                            arrayList4.add(str5);
                        }
                    }
                    String str6 = (String) map.get(outline.getPageId());
                    Outline outlineCopy$default = str6 == null ? null : Outline.copy$default(outline, str3, null, str4, str6, str2, (String) map.get(outline.getQuoteId()), arrayList4, 0L, 0L, 386, null);
                    if (outlineCopy$default != null) {
                        arrayList3.add(outlineCopy$default);
                    }
                }
                if (!arrayList3.isEmpty()) {
                    C26620o00Oo00o c26620o00Oo00o = this.f99679OooOo;
                    c28120OooOo00.f99683OooOoO0 = 1;
                    if (c26620o00Oo00o.OooO00o(str2, arrayList3, c28120OooOo00) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            return new Integer(0);
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("outline", "Couldn't restore data. " + C32460OooOooO.f116667OooO00o);
            return new Integer(-999);
        }
    }
}
