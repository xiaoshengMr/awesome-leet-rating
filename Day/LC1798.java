class LC1798 {



	public int slove(int[] conins) {

		int res = 1;
		Arrays.sort(conins);
		for(int i: conins) {
			if(i>res) break;
			res += i;
		}
		return res;
	}
}