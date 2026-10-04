package com.orion.penkit.models;

import java.lang.Number;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J#\u0010\b\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004H&¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m80612d2 = {"Lcom/orion/penkit/models/OnAssistLinesChangedListener;", "", "T", "", "", "Lcom/orion/penkit/models/AnchorAssistLine;", "lines", "LoO00ooO/OooOooO;", "onAssistLinesChanged", "(Ljava/util/Set;)V", "ni-penkit_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public interface OnAssistLinesChangedListener<T extends Number> {
    void onAssistLinesChanged(Set<? extends AnchorAssistLine<T>> lines);
}
