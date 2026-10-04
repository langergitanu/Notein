package com.aspose.words.internal;

import com.google.mlkit.p567nl.translate.TranslateLanguage;
import java.lang.ref.SoftReference;
import java.text.Collator;
import java.text.ParseException;
import java.text.RuleBasedCollator;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZHT {
    private static final Collator zzZHb;
    private static final ConcurrentMap<Locale, SoftReference<Collator>> zzZHf = new ConcurrentHashMap();
    private static final ConcurrentMap<Locale, Collator> zzZHe = new ConcurrentHashMap();
    private static final ConcurrentMap<Locale, Collator> zzZHd = new ConcurrentHashMap();
    public static final Locale zzZHa = new Locale(TranslateLanguage.ENGLISH, "NZ");
    private static final Collator zzZHc = zzTO("&'-';\u00ad;‐;‑;‒;–;—;―;−<'_'<¯<','<';'<':'<'!'<¡<'?'<¿<'/'<'.'<´<'`'<'^'<¨<'~'<·<¸<''<'\"'<«<»<'('<')'<'['<']'<'{'<'}'<§<¶<©<®<'@'<¤<฿<¢<₡<₢<'$'<₫<€<₣<₤<₥<₦<₧<£<₨<₪<₩<¥<'*'<'\\'<'&'<'#'<'%'<'+'<±<÷<×<'<'<'='<'>'<¬<'|'<¦<°<µ<0<1<2<3<4<5<6<7<8<9<¼<½<¾<a,A<''a,''A<b,B<''b,''B<c,C<''c,''C<d,D<''d,''D<ð,Ð<e,E<''e,''E<f,F<''f,''F<g,G<''g,''G<h,H<''h,''H<i,I<''i,''I<j,J<''j,''J<k,K<''k,''K<l,L<''l,''L<m,M<''m,''M<n,N<''n,''N<o,O<''o,''O<p,P<''p,''P<q,Q<''q,''Q<r,R<''r,''R<s, S & SS,ß<''s,ß=ss,''S<t,T& TH, Þ &TH, þ<''t,''T<u,U<''u,''U<v,V<''v,''V<w,W<''w,''W<x,X<''x,''X<y,Y<''y,''Y<z,Z&AE,Æ&AE,æ&OE,Œ&OE,œ<''z,''Z");

    static {
        Collator collatorZzTO = zzTO("&'-';\u00ad;‐;‑;‒;–;—;―;−<'_'<¯<','<';'<':'<'!'<¡<'?'<¿<'/'<'.'<´<'`'<'^'<¨<'~'<·<¸<''<'\"'<«<»<'('<')'<'['<']'<'{'<'}'<§<¶<©<®<'@'<¤<฿<¢<₡<₢<'$'<₫<€<₣<₤<₥<₦<₧<£<₨<₪<₩<¥<'*'<'\\'<'&'<'#'<'%'<'+'<±<÷<×<'<'<'='<'>'<¬<'|'<¦<°<µ<0<1<2<3<4<5<6<7<8<9<¼<½<¾<a,A<''a,''A<b,B<''b,''B<c,C<''c,''C<d,D<''d,''D<ð,Ð<e,E<''e,''E<f,F<''f,''F<g,G<''g,''G<h,H<''h,''H<i,I<''i,''I<j,J<''j,''J<k,K<''k,''K<l,L<''l,''L<m,M<''m,''M<n,N<''n,''N<o,O<''o,''O<p,P<''p,''P<q,Q<''q,''Q<r,R<''r,''R<s, S & SS,ß<''s,ß=ss,''S<t,T& TH, Þ &TH, þ<''t,''T<u,U<''u,''U<v,V<''v,''V<w,W<''w,''W<x,X<''x,''X<y,Y<''y,''Y<z,Z&AE,Æ&AE,æ&OE,Œ&OE,œ<''z,''Z");
        zzZHb = collatorZzTO;
        collatorZzTO.setStrength(1);
    }

    private static Collator zzTO(String str) {
        try {
            return new RuleBasedCollator(str);
        } catch (Exception e) {
            Collator collator = Collator.getInstance(Locale.ROOT);
            zzZHV.zzZ("Couldn't create root collator: ", e);
            return collator;
        }
    }

    private static Collator zzU(Locale locale) {
        Collator collator;
        SoftReference<Collator> softReferencePutIfAbsent = zzZHf.get(locale);
        Collator collator2 = softReferencePutIfAbsent != null ? softReferencePutIfAbsent.get() : null;
        if (collator2 == null) {
            collator2 = Collator.getInstance(locale);
            if (collator2 instanceof RuleBasedCollator) {
                collator2 = zzZ((RuleBasedCollator) collator2);
                do {
                    if (softReferencePutIfAbsent != null) {
                        zzZHf.remove(locale, softReferencePutIfAbsent);
                    }
                    softReferencePutIfAbsent = zzZHf.putIfAbsent(locale, new SoftReference<>(collator2));
                    if (softReferencePutIfAbsent != null) {
                        collator = softReferencePutIfAbsent.get();
                    }
                } while (collator == null);
                return collator;
            }
        }
        return collator2;
    }

    private static Collator zzV(Locale locale) {
        if (locale == Locale.ROOT) {
            return zzZHb;
        }
        ConcurrentMap<Locale, Collator> concurrentMap = zzZHe;
        Collator collatorZzco = concurrentMap.get(locale);
        if (collatorZzco == null) {
            collatorZzco = zzZHa.equals(locale) ? zzco() : Collator.getInstance(locale);
            collatorZzco.setStrength(1);
            concurrentMap.putIfAbsent(locale, collatorZzco);
        }
        return collatorZzco;
    }

    private static Collator zzW(Locale locale) {
        if (locale == Locale.ROOT) {
            return zzZHc;
        }
        ConcurrentMap<Locale, Collator> concurrentMap = zzZHd;
        Collator collatorZzco = concurrentMap.get(locale);
        if (collatorZzco == null) {
            collatorZzco = zzZHa.equals(locale) ? zzco() : Collator.getInstance(locale);
            concurrentMap.putIfAbsent(locale, collatorZzco);
        }
        return collatorZzco;
    }

    private static Collator zzZ(RuleBasedCollator ruleBasedCollator) {
        if (ruleBasedCollator == null) {
            throw new IllegalArgumentException("RuleBasedCollator must be present.");
        }
        try {
            RuleBasedCollator ruleBasedCollator2 = new RuleBasedCollator("&'-';\u00ad;‐;‑;‒;–;—;―;−<'_'");
            ruleBasedCollator2.setDecomposition(ruleBasedCollator.getDecomposition());
            ruleBasedCollator2.setStrength(ruleBasedCollator.getStrength());
            return ruleBasedCollator2;
        } catch (ParseException e) {
            zzZHV.zzZ(e);
            return ruleBasedCollator;
        }
    }

    private static Collator zzco() {
        Collator collator = Collator.getInstance(zzZHa);
        if (!(collator instanceof RuleBasedCollator)) {
            return collator;
        }
        return zzTO(((RuleBasedCollator) collator).getRules() + "&A=S&z,Z<'-'&ß<t,T,TH,Ø<t,T,TH&a,A<''a,''A<b,B<''b,''B<root,C<''root,''C<d,D<''d,''D<ð,Ð<e,E<''e,''E<f,F<''f,''F<g,G<''g,''G<h,H<''h,''H<i,I<''i,''I<j,J<''j,''J<k,K<''k,''K<l,L<''l,''L<m,M<''m,''M<n,N<''n,''N<o,O<''o,''O<p,P<''p,''P<q,Q<''q,''Q<r,R<''r,''R<s, S & SS,ß<''s,ß=ss,''S<t,T& TH, Þ &TH, þ<''t,''T<u,U<''u,''U<v,V<''v,''V<w,W<''w,''W<x,X<''x,''X<y,Y<''y,''Y<z,Z&AE,Æ&AE,æ&OE,Œ&OE,œ<''z,''Z");
    }

    public static Collator zzcp() {
        return zzU(zzZNG.zzpZ().getLocale());
    }

    public static Collator zzcq() {
        return zzZHb;
    }

    public static Collator zzcr() {
        return zzZHc;
    }

    public static Collator zzcs() {
        return zzV(zzZNG.zzpZ().getLocale());
    }

    public static Collator zzct() {
        return zzW(zzZNG.zzpZ().getLocale());
    }
}
