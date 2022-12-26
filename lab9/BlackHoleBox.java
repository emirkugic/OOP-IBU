package week12;

public class BlackHoleBox extends Box {
private Thing thing;

public BlackHoleBox() {
    this.thing = null;
}

@Override
public void add(Thing thing) {
    this.thing = thing;
}

@Override
public boolean isInTheBox(Thing thing) {
    return false;
}
}