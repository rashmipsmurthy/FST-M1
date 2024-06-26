import pytest

@pytest.mark.greater
def test_greater():
    x = 2
    y = 5
    assert y > x

@pytest.mark.greater
def test_greater_equal():
    x = 6
    y = 6
    assert y >= x

@pytest.mark.lesser
#@pytest.mark.skipif(condition x==10)
#@pytest.mark.skip
@pytest.mark.xfail
def test_lesser():
    x = 2
    y = 5
    assert x < y