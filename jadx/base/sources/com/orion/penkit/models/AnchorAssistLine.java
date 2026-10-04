package com.orion.penkit.models;

import java.lang.Number;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003R\u0018\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, m80612d2 = {"Lcom/orion/penkit/models/AnchorAssistLine;", "T", "", "", "a", "Lcom/orion/penkit/models/AssistPoint;", "getA", "()Lcom/orion/penkit/models/AssistPoint;", "b", "getB", "Lcom/orion/penkit/models/HorizontalLine;", "Lcom/orion/penkit/models/VerticalLine;", "ni-penkit_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public interface AnchorAssistLine<T extends Number> {
    AssistPoint<T> getA();

    AssistPoint<T> getB();
}
