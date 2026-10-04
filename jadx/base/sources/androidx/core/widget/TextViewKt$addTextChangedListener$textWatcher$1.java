package androidx.core.widget;

import android.text.Editable;
import android.text.TextWatcher;
import com.huawei.hms.network.embedded.C18293o1;
import kotlin.Metadata;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32509OooOOo;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0010\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, m80612d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "LoO00ooO/OooOooO;", "afterTextChanged", "(Landroid/text/Editable;)V", "", "text", "", "start", C18293o1.f55803f, "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "core-ktx_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 176)
public final class TextViewKt$addTextChangedListener$textWatcher$1 implements TextWatcher {
    final /* synthetic */ InterfaceC32507OooOO0o<Editable, C32460OooOooO> $afterTextChanged;
    final /* synthetic */ InterfaceC32509OooOOo<CharSequence, Integer, Integer, Integer, C32460OooOooO> $beforeTextChanged;
    final /* synthetic */ InterfaceC32509OooOOo<CharSequence, Integer, Integer, Integer, C32460OooOooO> $onTextChanged;

    /* JADX WARN: Multi-variable type inference failed */
    public TextViewKt$addTextChangedListener$textWatcher$1(InterfaceC32507OooOO0o<? super Editable, C32460OooOooO> interfaceC32507OooOO0o, InterfaceC32509OooOOo<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, C32460OooOooO> interfaceC32509OooOOo, InterfaceC32509OooOOo<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, C32460OooOooO> interfaceC32509OooOOo2) {
        this.$afterTextChanged = interfaceC32507OooOO0o;
        this.$beforeTextChanged = interfaceC32509OooOOo;
        this.$onTextChanged = interfaceC32509OooOOo2;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable s) {
        this.$afterTextChanged.invoke(s);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence text, int start, int count, int after) {
        this.$beforeTextChanged.invoke(text, Integer.valueOf(start), Integer.valueOf(count), Integer.valueOf(after));
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence text, int start, int before, int count) {
        this.$onTextChanged.invoke(text, Integer.valueOf(start), Integer.valueOf(before), Integer.valueOf(count));
    }
}
