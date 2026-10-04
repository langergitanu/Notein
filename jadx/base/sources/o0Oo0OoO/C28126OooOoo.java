package o0Oo0OoO;

import Oooo0OO.AbstractC20960OooOOOO;
import android.util.Log;
import com.orion.notein.data.p602db.entity.QuoteEntity;
import com.orion.notein.domain.mapper.QuoteMapper;
import com.orion.notein.domain.models.page.Quote;
import java.util.ArrayList;
import java.util.Map;
import o000O00.C24378OooOoO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0Oo0OoO.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28126OooOoo extends AbstractC20960OooOOOO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C24378OooOoO0 f99723OooOo;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final QuoteMapper f99724OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28126OooOoo(C24378OooOoO0 c24378OooOoO0, QuoteMapper mapper) {
        super(2);
        kotlin.jvm.internal.OooOOO0.OooO0oO(mapper, "mapper");
        this.f99723OooOo = c24378OooOoO0;
        this.f99724OooOoO0 = mapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o00000Oo(String str, Map map, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C28127OooOoo0 c28127OooOoo0;
        if (abstractC32479OooO0OO instanceof C28127OooOoo0) {
            c28127OooOoo0 = (C28127OooOoo0) abstractC32479OooO0OO;
            int i = c28127OooOoo0.f99727OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28127OooOoo0.f99727OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c28127OooOoo0 = new C28127OooOoo0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c28127OooOoo0.f99726OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c28127OooOoo0.f99727OooOoO0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                ArrayList arrayListO00000 = o00000(QuoteEntity.class, str + "/quote");
                ArrayList<QuoteEntity> arrayList = new ArrayList();
                for (Object obj2 : arrayListO00000) {
                    QuoteEntity quoteEntity = (QuoteEntity) obj2;
                    if (map.containsKey(quoteEntity.getPageId()) && map.containsKey(quoteEntity.getId())) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
                for (QuoteEntity quoteEntity2 : arrayList) {
                    Quote quote = this.f99724OooOoO0.toQuote(quoteEntity2);
                    Object obj3 = map.get(quoteEntity2.getId());
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(obj3);
                    String str3 = (String) obj3;
                    Object obj4 = map.get(quoteEntity2.getPageId());
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(obj4);
                    Object obj5 = map.get(quoteEntity2.getLinkId());
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(obj5);
                    arrayList2.add(Quote.copy$default(quote, str3, (String) obj4, 0, 0, 0, null, null, null, null, 0, (String) obj5, null, System.currentTimeMillis(), false, false, 27644, null));
                }
                C24378OooOoO0 c24378OooOoO0 = this.f99723OooOo;
                c28127OooOoo0.f99727OooOoO0 = 1;
                if (c24378OooOoO0.OooO00o(str2, arrayList2, c28127OooOoo0) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
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
            Log.e("quote", "Couldn't restore data. " + C32460OooOooO.f116667OooO00o);
            return new Integer(-999);
        }
    }
}
