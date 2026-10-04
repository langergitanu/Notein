package androidx.core.widget;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOOO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32509OooOOo;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a>\u0010\u0007\u001a\u00020\u0006*\u00020\u00002(\b\u0004\u0010\u0005\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\u0086\b¢\u0006\u0004\b\u0007\u0010\b\u001a>\u0010\t\u001a\u00020\u0006*\u00020\u00002(\b\u0004\u0010\u0005\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\u0086\b¢\u0006\u0004\b\t\u0010\b\u001a,\u0010\f\u001a\u00020\u0006*\u00020\u00002\u0016\b\u0004\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00040\nH\u0086\b¢\u0006\u0004\b\f\u0010\r\u001a\u0080\u0001\u0010\u0011\u001a\u00020\u0006*\u00020\u00002(\b\u0006\u0010\u000e\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012(\b\u0006\u0010\u000f\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u0016\b\u0006\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00040\nH\u0086\b¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m80612d2 = {"Landroid/widget/TextView;", "Lkotlin/Function4;", "", "", "LoO00ooO/OooOooO;", "action", "Landroid/text/TextWatcher;", "doBeforeTextChanged", "(Landroid/widget/TextView;LoO0O000o/OooOOo;)Landroid/text/TextWatcher;", "doOnTextChanged", "Lkotlin/Function1;", "Landroid/text/Editable;", "doAfterTextChanged", "(Landroid/widget/TextView;LoO0O000o/OooOO0o;)Landroid/text/TextWatcher;", "beforeTextChanged", "onTextChanged", "afterTextChanged", "addTextChangedListener", "(Landroid/widget/TextView;LoO0O000o/OooOOo;LoO0O000o/OooOOo;LoO0O000o/OooOO0o;)Landroid/text/TextWatcher;", "core-ktx_release"}, m80613k = 2, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class TextViewKt {

    /* JADX INFO: renamed from: androidx.core.widget.TextViewKt$addTextChangedListener$1 */
    @Metadata(m80611d1 = {"\u0000\u0016\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, m80612d2 = {"", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "<anonymous parameter 2>", "<anonymous parameter 3>", "LoO00ooO/OooOooO;", "invoke", "(Ljava/lang/CharSequence;III)V", "<anonymous>"}, m80613k = 3, m80614mv = {1, 8, 0})
    public static final class C00851 extends OooOOOO implements InterfaceC32509OooOOo<CharSequence, Integer, Integer, Integer, C32460OooOooO> {
        public static final C00851 INSTANCE = new C00851();

        public C00851() {
            super(4);
        }

        public final void invoke(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // oO0O000o.InterfaceC32509OooOOo
        public /* bridge */ /* synthetic */ C32460OooOooO invoke(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
            invoke(charSequence, num.intValue(), num2.intValue(), num3.intValue());
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.TextViewKt$addTextChangedListener$2 */
    @Metadata(m80611d1 = {"\u0000\u0016\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, m80612d2 = {"", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "<anonymous parameter 2>", "<anonymous parameter 3>", "LoO00ooO/OooOooO;", "invoke", "(Ljava/lang/CharSequence;III)V", "<anonymous>"}, m80613k = 3, m80614mv = {1, 8, 0})
    public static final class C00862 extends OooOOOO implements InterfaceC32509OooOOo<CharSequence, Integer, Integer, Integer, C32460OooOooO> {
        public static final C00862 INSTANCE = new C00862();

        public C00862() {
            super(4);
        }

        public final void invoke(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // oO0O000o.InterfaceC32509OooOOo
        public /* bridge */ /* synthetic */ C32460OooOooO invoke(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
            invoke(charSequence, num.intValue(), num2.intValue(), num3.intValue());
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.TextViewKt$addTextChangedListener$3 */
    @Metadata(m80611d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m80612d2 = {"Landroid/text/Editable;", TranslateLanguage.ITALIAN, "LoO00ooO/OooOooO;", "invoke", "(Landroid/text/Editable;)V", "<anonymous>"}, m80613k = 3, m80614mv = {1, 8, 0})
    public static final class C00873 extends OooOOOO implements InterfaceC32507OooOO0o<Editable, C32460OooOooO> {
        public static final C00873 INSTANCE = new C00873();

        public C00873() {
            super(1);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Editable editable) {
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public /* bridge */ /* synthetic */ C32460OooOooO invoke(Editable editable) {
            invoke2(editable);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final TextWatcher addTextChangedListener(TextView textView, InterfaceC32509OooOOo<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, C32460OooOooO> interfaceC32509OooOOo, InterfaceC32509OooOOo<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, C32460OooOooO> interfaceC32509OooOOo2, InterfaceC32507OooOO0o<? super Editable, C32460OooOooO> interfaceC32507OooOO0o) {
        TextViewKt$addTextChangedListener$textWatcher$1 textViewKt$addTextChangedListener$textWatcher$1 = new TextViewKt$addTextChangedListener$textWatcher$1(interfaceC32507OooOO0o, interfaceC32509OooOOo, interfaceC32509OooOOo2);
        textView.addTextChangedListener(textViewKt$addTextChangedListener$textWatcher$1);
        return textViewKt$addTextChangedListener$textWatcher$1;
    }

    public static /* synthetic */ TextWatcher addTextChangedListener$default(TextView textView, InterfaceC32509OooOOo interfaceC32509OooOOo, InterfaceC32509OooOOo interfaceC32509OooOOo2, InterfaceC32507OooOO0o interfaceC32507OooOO0o, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC32509OooOOo = C00851.INSTANCE;
        }
        if ((i & 2) != 0) {
            interfaceC32509OooOOo2 = C00862.INSTANCE;
        }
        if ((i & 4) != 0) {
            interfaceC32507OooOO0o = C00873.INSTANCE;
        }
        TextViewKt$addTextChangedListener$textWatcher$1 textViewKt$addTextChangedListener$textWatcher$1 = new TextViewKt$addTextChangedListener$textWatcher$1(interfaceC32507OooOO0o, interfaceC32509OooOOo, interfaceC32509OooOOo2);
        textView.addTextChangedListener(textViewKt$addTextChangedListener$textWatcher$1);
        return textViewKt$addTextChangedListener$textWatcher$1;
    }

    public static final TextWatcher doAfterTextChanged(TextView textView, final InterfaceC32507OooOO0o<? super Editable, C32460OooOooO> interfaceC32507OooOO0o) {
        TextWatcher textWatcher = new TextWatcher() { // from class: androidx.core.widget.TextViewKt$doAfterTextChanged$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                interfaceC32507OooOO0o.invoke(s);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
            }
        };
        textView.addTextChangedListener(textWatcher);
        return textWatcher;
    }

    public static final TextWatcher doBeforeTextChanged(TextView textView, final InterfaceC32509OooOOo<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, C32460OooOooO> interfaceC32509OooOOo) {
        TextWatcher textWatcher = new TextWatcher() { // from class: androidx.core.widget.TextViewKt$doBeforeTextChanged$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
                interfaceC32509OooOOo.invoke(text, Integer.valueOf(start), Integer.valueOf(count), Integer.valueOf(after));
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
            }
        };
        textView.addTextChangedListener(textWatcher);
        return textWatcher;
    }

    public static final TextWatcher doOnTextChanged(TextView textView, final InterfaceC32509OooOOo<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, C32460OooOooO> interfaceC32509OooOOo) {
        TextWatcher textWatcher = new TextWatcher() { // from class: androidx.core.widget.TextViewKt$doOnTextChanged$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
                interfaceC32509OooOOo.invoke(text, Integer.valueOf(start), Integer.valueOf(before), Integer.valueOf(count));
            }
        };
        textView.addTextChangedListener(textWatcher);
        return textWatcher;
    }
}
