package com.orion.notein.data.repo.transactions;

import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.orion.notein.data.service.dto.transactions.TransactionsProductDto;
import com.orion.notein.data.service.responsebody.transactions.CommodityHint;
import com.orion.notein.data.service.responsebody.transactions.LocalizedHint;
import com.orion.notein.data.service.responsebody.transactions.PurchaseHintsResponse;
import com.orion.notein.data.service.responsebody.transactions.TransactionsProductResponse;
import com.orion.notein.domain.models.transactions.Product;
import com.orion.notein.domain.models.transactions.PurchaseHintCollection;
import com.orion.notein.domain.models.transactions.TransactionsProductResult;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0O0o.C33599OooOo0O;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34436OooOoOO;

/* JADX INFO: loaded from: classes9.dex */
public final class o000000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0O0O00 f70331OooO00o;

    public o000000O(o0O0O00 o0o0o00) {
        this.f70331OooO00o = o0o0o00;
    }

    public static String OooO0OO(LocalizedHint localizedHint, Locale locale) {
        String language = locale.getLanguage();
        kotlin.jvm.internal.OooOOO0.OooO0o(language, "getLanguage(...)");
        Locale ROOT = Locale.ROOT;
        kotlin.jvm.internal.OooOOO0.OooO0o(ROOT, "ROOT");
        String lowerCase = language.toLowerCase(ROOT);
        kotlin.jvm.internal.OooOOO0.OooO0o(lowerCase, "toLowerCase(...)");
        String country = locale.getCountry();
        kotlin.jvm.internal.OooOOO0.OooO0o(country, "getCountry(...)");
        String upperCase = country.toUpperCase(ROOT);
        kotlin.jvm.internal.OooOOO0.OooO0o(upperCase, "toUpperCase(...)");
        if (lowerCase.equals(TranslateLanguage.CHINESE)) {
            boolean z = upperCase.equals("TW") || upperCase.equals("HK") || upperCase.equals("MO");
            String zhTW = z ? localizedHint.getZhTW() : localizedHint.getZhCN();
            if (zhTW != null && !C33599OooOo0O.Oooo0o0(zhTW)) {
                return zhTW;
            }
            String zhCN = z ? localizedHint.getZhCN() : localizedHint.getZhTW();
            if (zhCN != null && !C33599OooOo0O.Oooo0o0(zhCN)) {
                return zhCN;
            }
        }
        String en = localizedHint.getEn();
        if (en != null && !C33599OooOo0O.Oooo0o0(en)) {
            return localizedHint.getEn();
        }
        String zhCN2 = localizedHint.getZhCN();
        return (zhCN2 == null && (zhCN2 = localizedHint.getZhTW()) == null) ? localizedHint.getEn() : zhCN2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o000OOo o000ooo2;
        o000000O o000000o2;
        if (abstractC32479OooO0OO instanceof o000OOo) {
            o000ooo2 = (o000OOo) abstractC32479OooO0OO;
            int i = o000ooo2.f70334OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                o000ooo2.f70334OooOoO = i - Integer.MIN_VALUE;
            } else {
                o000ooo2 = new o000OOo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = o000ooo2.f70332OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o000ooo2.f70334OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            o000ooo2.f70333OooOo0o = this;
            o000ooo2.f70334OooOoO = 1;
            objOooO00o = this.f70331OooO00o.OooO00o(o000ooo2);
            if (objOooO00o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            o000000o2 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000000o2 = o000ooo2.f70333OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
        }
        TransactionsProductResponse transactionsProductResponse = (TransactionsProductResponse) objOooO00o;
        if (transactionsProductResponse == null) {
            return TransactionsProductResult.Companion.Error$default(TransactionsProductResult.INSTANCE, null, 1, null);
        }
        List<TransactionsProductDto> products = transactionsProductResponse.getProducts();
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(products, 10));
        for (TransactionsProductDto transactionsProductDto : products) {
            o000000o2.getClass();
            arrayList.add(new Product(transactionsProductDto.getId(), transactionsProductDto.getPrice(), transactionsProductDto.getOriginPrice(), transactionsProductDto.getPosition(), transactionsProductDto.getTopBannerMsg(), transactionsProductDto.getBottomBannerMsg(), transactionsProductDto.getSuggestion(), transactionsProductDto.getDetailDescription(), transactionsProductDto.getName(), transactionsProductDto.getDescription(), transactionsProductDto.getStock(), transactionsProductDto.getStatus(), transactionsProductDto.getCurrency(), transactionsProductDto.getInfo(), transactionsProductDto.getType()));
        }
        return new TransactionsProductResult(arrayList, transactionsProductResponse.getErrorCode());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r3v1, types: [oOo000Oo.OooOoO] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v6, types: [oOo000Oo.OooOoOO] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o000000 o000000Var;
        o000000O o000000o2;
        ?? arrayList;
        ?? linkedHashMap;
        List<CommodityHint> commodityHints;
        String strOooO0OO;
        List<LocalizedHint> generalHints;
        if (abstractC32479OooO0OO instanceof o000000) {
            o000000Var = (o000000) abstractC32479OooO0OO;
            int i = o000000Var.f70329OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                o000000Var.f70329OooOoO = i - Integer.MIN_VALUE;
            } else {
                o000000Var = new o000000(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0O0 = o000000Var.f70327OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o000000Var.f70329OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0O0);
            o000000Var.f70328OooOo0o = this;
            o000000Var.f70329OooOoO = 1;
            objOooO0O0 = this.f70331OooO00o.OooO0O0(o000000Var);
            if (objOooO0O0 == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            o000000o2 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000000o2 = o000000Var.f70328OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0O0);
        }
        PurchaseHintsResponse purchaseHintsResponse = (PurchaseHintsResponse) objOooO0O0;
        Locale locale = Locale.getDefault();
        if (purchaseHintsResponse == null || (generalHints = purchaseHintsResponse.getGeneralHints()) == null) {
            arrayList = C34434OooOoO.f123453OooOo0o;
        } else {
            arrayList = new ArrayList();
            for (LocalizedHint localizedHint : generalHints) {
                kotlin.jvm.internal.OooOOO0.OooO0Oo(locale);
                o000000o2.getClass();
                String strOooO0OO2 = OooO0OO(localizedHint, locale);
                if (strOooO0OO2 != null) {
                    arrayList.add(strOooO0OO2);
                }
            }
        }
        if (purchaseHintsResponse == null || (commodityHints = purchaseHintsResponse.getCommodityHints()) == null) {
            linkedHashMap = C34436OooOoOO.f123455OooOo0o;
        } else {
            ArrayList<C32443OooOOO> arrayList2 = new ArrayList();
            for (CommodityHint commodityHint : commodityHints) {
                LocalizedHint hint = commodityHint.getHint();
                if (hint != null) {
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(locale);
                    o000000o2.getClass();
                    strOooO0OO = OooO0OO(hint, locale);
                } else {
                    strOooO0OO = null;
                }
                C32443OooOOO c32443OooOOO = strOooO0OO != null ? new C32443OooOOO(commodityHint.getCommodityId(), strOooO0OO) : null;
                if (c32443OooOOO != null) {
                    arrayList2.add(c32443OooOOO);
                }
            }
            linkedHashMap = new LinkedHashMap();
            for (C32443OooOOO c32443OooOOO2 : arrayList2) {
                String str = (String) c32443OooOOO2.f116638OooOo0o;
                Object arrayList3 = linkedHashMap.get(str);
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                    linkedHashMap.put(str, arrayList3);
                }
                ((List) arrayList3).add((String) c32443OooOOO2.f116637OooOo);
            }
        }
        return new PurchaseHintCollection(arrayList, linkedHashMap);
    }
}
