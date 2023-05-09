/*
 * 一个宿舍有十五个女生，每天三人一组发出散步，一周后每人分别与其他十四人外出一次，求排列组合。
*/
package com.rhj;

class Coukman {
	public static void main(String args[]) {
		int a, b, i, j, k, x, y, z, g, l, m, p, o = 0, vv = 0, vv2 = 0, cout = 0;
		int temp[][] = new int[35][3];
		int temp1[] = new int[3];
		int temp2[] = new int[3];
		int temp3[] = new int[3];
		int temp4[] = new int[3];
		int temp5[] = new int[3];
		int temp6[] = new int[15];
		int sum1[] = new int[15];
		int num[][] = new int[2730][3];
		int week1[] = new int[15];
		int week2[] = new int[15];
		int week3[] = new int[15];
		int week4[] = new int[15];
		int week5[] = new int[15];
		int week6[] = new int[15];
		int week7[] = new int[15];
		int sum[][] = new int[56][15];
		int end[][][] = new int[100000][7][15];
		int end1[][] = new int[7][15];
		int end2[][] = new int[7][15];

		// 用于计算不相同的35组排列
		for (i = 0; i < 15; i++) {
			for (j = 0; j < 15; j++) {
				for (k = 0; k < 15; k++) {
					if (i != j && j != k && k != i) {
						temp1[0] = i;
						temp1[1] = j;
						temp1[2] = k;

						if (i == 0 && j == 1 && k == 2) {

							temp[o][0] = i;
							temp[o][1] = j;
							temp[o][2] = k;

							o++;
						}

						else {
							y = 0;
							for (x = 0; x < o; x++) {
								temp2[0] = temp[x][0];
								temp2[1] = temp[x][1];
								temp2[2] = temp[x][2];

								if (test4(temp2, temp1)) {
									y++;
								}
								if (y == o) {
									temp[o][0] = i;
									temp[o][1] = j;
									temp[o][2] = k;
									o++;
									// System.out.println(o);
								}
							}

						}

					}
				}
			}
		}
		// 用于计算不重复的56组;
		o = 0;
		for (i = 0; i < 35; i++) {
			for (z = 0; z < 3; z++) {
				temp1[z] = temp[i][z];
			}
			for (j = 0; j < 35; j++) {
				for (z = 0; z < 3; z++) {
					temp2[z] = temp[j][z];
				}
				if (test(temp1, temp2)) {
					for (k = 0; k < 35; k++) {
						for (z = 0; z < 3; z++) {
							temp3[z] = temp[k][z];
						}
						if (test(temp1, temp3) && test(temp2, temp3)) {
							for (x = 0; x < 35; x++) {
								for (z = 0; z < 3; z++) {
									temp4[z] = temp[x][z];
								}
								if (test(temp1, temp4) && test(temp2, temp4)
										&& test(temp3, temp4)) {
									for (y = 0; y < 35; y++) {
										for (z = 0; z < 3; z++) {
											temp5[z] = temp[y][z];
										}
										if (test(temp1, temp5)
												&& test(temp2, temp5)
												&& test(temp3, temp5)
												&& test(temp4, temp5)) {
											temp6[0] = temp1[0];
											temp6[1] = temp1[1];
											temp6[2] = temp1[2];
											temp6[3] = temp2[0];
											temp6[4] = temp2[1];
											temp6[5] = temp2[2];
											temp6[6] = temp3[0];
											temp6[7] = temp3[1];
											temp6[8] = temp3[2];
											temp6[9] = temp4[0];
											temp6[10] = temp4[1];
											temp6[11] = temp4[2];
											temp6[12] = temp5[0];
											temp6[13] = temp5[1];
											temp6[14] = temp5[2];

											if (temp1[0] == 0 && temp1[1] == 1
													&& temp1[2] == 2
													&& temp2[0] == 3
													&& temp2[1] == 7
													&& temp2[2] == 11
													&& temp3[0] == 4
													&& temp3[1] == 9
													&& temp3[2] == 14
													&& temp4[0] == 5
													&& temp4[1] == 10
													&& temp4[2] == 12
													&& temp5[0] == 6
													&& temp5[1] == 8
													&& temp5[2] == 13) {
												sum[o][0] = temp1[0];
												sum[o][1] = temp1[1];
												sum[o][2] = temp1[2];
												sum[o][3] = temp2[0];
												sum[o][4] = temp2[1];
												sum[o][5] = temp2[2];
												sum[o][6] = temp3[0];
												sum[o][7] = temp3[1];
												sum[o][8] = temp3[2];
												sum[o][9] = temp4[0];
												sum[o][10] = temp4[1];
												sum[o][11] = temp4[2];
												sum[o][12] = temp5[0];
												sum[o][13] = temp5[1];
												sum[o][14] = temp5[2];

												o++;
												// System.out.println(o);
											} else {
												// System.out.println(o);
												vv = 0;
												for (vv2 = 0; vv2 < o; vv2++) {
													sum1[0] = sum[vv2][0];
													sum1[1] = sum[vv2][1];
													sum1[2] = sum[vv2][2];
													sum1[3] = sum[vv2][3];
													sum1[4] = sum[vv2][4];
													sum1[5] = sum[vv2][5];
													sum1[6] = sum[vv2][6];
													sum1[7] = sum[vv2][7];
													sum1[8] = sum[vv2][8];
													sum1[9] = sum[vv2][9];
													sum1[10] = sum[vv2][10];
													sum1[11] = sum[vv2][11];
													sum1[12] = sum[vv2][12];
													sum1[13] = sum[vv2][13];
													sum1[14] = sum[vv2][14];

													if (test5(temp6, sum1)) {
														vv++;

													}

													if (vv == o) {
														sum[o][0] = temp1[0];
														sum[o][1] = temp1[1];
														sum[o][2] = temp1[2];
														sum[o][3] = temp2[0];
														sum[o][4] = temp2[1];
														sum[o][5] = temp2[2];
														sum[o][6] = temp3[0];
														sum[o][7] = temp3[1];
														sum[o][8] = temp3[2];
														sum[o][9] = temp4[0];
														sum[o][10] = temp4[1];
														sum[o][11] = temp4[2];
														sum[o][12] = temp5[0];
														sum[o][13] = temp5[1];
														sum[o][14] = temp5[2];
														o++;

														// System.out.println(o);
													}

												}

											}

										}
									}
								}
							}
						}
					}
				}
			}
		}
		// 用于计算最终的排列组合;
		o = 0;
		for (i = 0; i < 56; i++) {
			for (z = 0; z < 15; z++) {
				week1[z] = sum[i][z];
			}

			for (j = 0; j < 56; j++) {
				for (z = 0; z < 15; z++) {
					week2[z] = sum[j][z];
				}

				if (test1(week2, week1)) {
					for (k = 0; k < 56; k++) {
						for (z = 0; z < 15; z++) {
							week3[z] = sum[k][z];

						}

						if (test1(week3, week2) && test1(week3, week1)) {
							for (x = 0; x < 56; x++) {
								for (z = 0; z < 15; z++) {
									week4[z] = sum[x][z];
								}
								if (test1(week4, week1) && test1(week4, week2)
										&& test1(week4, week3)) {
									for (y = 0; y < 56; y++) {
										for (z = 0; z < 15; z++) {
											week5[z] = sum[y][z];
										}
										if (test1(week5, week1)
												&& test1(week5, week2)
												&& test1(week5, week3)
												&& test1(week5, week4)) {
											for (l = 0; l < 56; l++) {
												for (z = 0; z < 15; z++) {
													week6[z] = sum[l][z];
												}
												if (test1(week6, week1)
														&& test1(week6, week2)
														&& test1(week6, week3)
														&& test1(week6, week4)
														&& test1(week6, week5)) {
													for (m = 0; m < 56; m++) {
														for (z = 0; z < 15; z++) {
															week7[z] = sum[m][z];
														}
														if (test1(week7, week1)
																&& test1(week7,
																		week2)
																&& test1(week7,
																		week3)
																&& test1(week7,
																		week4)
																&& test1(week7,
																		week5)
																&& test1(week7,
																		week6)) {
															for (m = 0; m < 56; m++) {
																for (z = 0; z < 15; z++) {
																	week7[z] = sum[m][z];
																}
																if (test1(
																		week7,
																		week1)
																		&& test1(
																				week7,
																				week2)
																		&& test1(
																				week7,
																				week3)
																		&& test1(
																				week7,
																				week4)
																		&& test1(
																				week7,
																				week5)
																		&& test1(
																				week7,
																				week6)) {
																	for (vv = 0; vv < 15; vv++) {
																		end1[0][vv] = week1[vv];
																	}
																	for (vv = 0; vv < 15; vv++) {
																		end1[1][vv] = week2[vv];
																	}
																	for (vv = 0; vv < 15; vv++) {
																		end1[2][vv] = week3[vv];
																	}
																	for (vv = 0; vv < 15; vv++) {
																		end1[3][vv] = week4[vv];
																	}
																	for (vv = 0; vv < 15; vv++) {
																		end1[4][vv] = week5[vv];
																	}
																	for (vv = 0; vv < 15; vv++) {
																		end1[5][vv] = week6[vv];
																	}
																	for (vv = 0; vv < 15; vv++) {
																		end1[6][vv] = week7[vv];
																	}

																	if (cout == 0) {
																		for (vv = 0; vv < 15; vv++) {
																			end[o][0][vv] = week1[vv];
																		}
																		for (vv = 0; vv < 15; vv++) {
																			end[o][1][vv] = week2[vv];
																		}
																		for (vv = 0; vv < 15; vv++) {
																			end[o][2][vv] = week3[vv];
																		}
																		for (vv = 0; vv < 15; vv++) {
																			end[o][3][vv] = week4[vv];
																		}
																		for (vv = 0; vv < 15; vv++) {
																			end[o][4][vv] = week5[vv];
																		}
																		for (vv = 0; vv < 15; vv++) {
																			end[o][5][vv] = week6[vv];
																		}
																		for (vv = 0; vv < 15; vv++) {
																			end[o][6][vv] = week7[vv];
																		}
																		o++;
																		cout = 9;
																	}

																	else {
																		vv2 = 0;
																		for (a = 0; a < o; a++) {
																			for (b = 0; b < 7; b++) {
																				for (p = 0; p < 15; p++) {
																					end2[b][p] = end[a][b][p];
																				}
																			}

																			if (test7(
																					end1,
																					end2)) {
																				vv2++;
																			}
																		}
																		if (vv2 == o) {
																			for (vv = 0; vv < 15; vv++) {
																				end[o][0][vv] = week1[vv];
																			}
																			for (vv = 0; vv < 15; vv++) {
																				end[o][1][vv] = week2[vv];
																			}
																			for (vv = 0; vv < 15; vv++) {
																				end[o][2][vv] = week3[vv];
																			}
																			for (vv = 0; vv < 15; vv++) {
																				end[o][3][vv] = week4[vv];
																			}
																			for (vv = 0; vv < 15; vv++) {
																				end[o][4][vv] = week5[vv];
																			}
																			for (vv = 0; vv < 15; vv++) {
																				end[o][5][vv] = week6[vv];
																			}
																			for (vv = 0; vv < 15; vv++) {
																				end[o][6][vv] = week7[vv];
																			}
																			o++;
																			// System.out.println(o);
																			System.out
																					.println("******************************************************");
																			for (z = 0; z < 15; z++) {
																				System.out
																						.print(week1[z]
																								+ " ");
																			}
																			System.out
																					.print("\n");
																			for (z = 0; z < 15; z++) {
																				System.out
																						.print(week2[z]
																								+ " ");
																			}
																			System.out
																					.print("\n");
																			for (z = 0; z < 15; z++) {
																				System.out
																						.print(week3[z]
																								+ " ");
																			}
																			System.out
																					.print("\n");
																			for (z = 0; z < 15; z++) {
																				System.out
																						.print(week4[z]
																								+ " ");
																			}
																			System.out
																					.print("\n");
																			for (z = 0; z < 15; z++) {
																				System.out
																						.print(week5[z]
																								+ " ");
																			}
																			System.out
																					.print("\n");
																			for (z = 0; z < 15; z++) {
																				System.out
																						.print(week6[z]
																								+ " ");
																			}
																			System.out
																					.print("\n");

																			for (z = 0; z < 15; z++) {
																				System.out
																						.print(week7[z]
																								+ " ");
																			}
																			System.out
																					.print("\n");
																			System.out
																					.print("\n");
																		}

																	}

																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}

		System.out.println(o);

		// */
	}

	public static int[] test3(int aa[]) {
		int a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p;
		int a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15;
		int num[] = new int[15];
		int temp[] = new int[15];
		o = 0;
		if (aa[0] != -1) {
			for (i = 0; i < 15; i++) {
				temp[i] = aa[i];
			}
		}
		for (a = 0; a < 15; a++) {
			a1 = a;
			for (b = 0; b < 15; b++) {
				a2 = b;
				if (a1 != a2) {
					for (c = 0; c < 15; c++) {
						a3 = c;
						if (a3 != a2 && a3 != a1) {
							for (d = 0; d < 15; d++) {
								a4 = d;
								if (a4 != a1 && a4 != a2 && a4 != a3) {
									for (e = 0; e < 15; e++) {
										a5 = e;
										if (a5 != a4 && a5 != a3 && a5 != a2
												&& a5 != a1) {
											for (f = 0; f < 15; f++) {
												a6 = f;
												if (a6 != a5 && a6 != a4
														&& a6 != a3 && a6 != a2
														&& a6 != a1) {
													for (g = 0; g < 15; g++) {
														a7 = g;
														if (a7 != a6
																&& a7 != a5
																&& a7 != a4
																&& a7 != a3
																&& a7 != a2
																&& a7 != a1) {
															for (h = 0; h < 15; h++) {
																a8 = h;
																if (a8 != a7
																		&& a8 != a6
																		&& a8 != a5
																		&& a8 != a4
																		&& a8 != a3
																		&& a8 != a2
																		&& a8 != a1) {
																	for (i = 0; i < 15; i++) {
																		a9 = i;
																		if (a9 != a8
																				&& a9 != a7
																				&& a9 != a6
																				&& a9 != a5
																				&& a9 != a4
																				&& a9 != a3
																				&& a9 != a2
																				&& a9 != a1) {
																			for (j = 0; j < 15; j++) {
																				a10 = j;
																				if (a10 != a9
																						&& a10 != a8
																						&& a10 != a7
																						&& a10 != a6
																						&& a10 != a5
																						&& a10 != a4
																						&& a10 != a3
																						&& a10 != a2
																						&& a10 != a1) {
																					for (k = 0; k < 15; k++) {
																						a11 = k;
																						if (a11 != a10
																								&& a11 != a9
																								&& a11 != a8
																								&& a11 != a7
																								&& a11 != a6
																								&& a11 != a5
																								&& a11 != a4
																								&& a11 != a3
																								&& a11 != a2
																								&& a11 != a1) {
																							for (l = 0; l < 15; l++) {
																								a12 = l;
																								if (a12 != a11
																										&& a12 != a10
																										&& a12 != a9
																										&& a12 != a8
																										&& a12 != a7
																										&& a12 != a6
																										&& a12 != a5
																										&& a12 != a4
																										&& a12 != a3
																										&& a12 != a2
																										&& a12 != a1) {
																									for (m = 0; m < 15; m++) {
																										a13 = m;
																										if (a13 != a12
																												&& a13 != a11
																												&& a13 != a10
																												&& a13 != a9
																												&& a13 != a8
																												&& a13 != a7
																												&& a13 != a6
																												&& a13 != a5
																												&& a13 != a4
																												&& a13 != a3
																												&& a13 != a2
																												&& a13 != a1) {
																											for (n = 0; n < 15; n++) {
																												a14 = n;
																												if (a14 != a13
																														&& a14 != a12
																														&& a14 != a11
																														&& a14 != a10
																														&& a14 != a9
																														&& a14 != a8
																														&& a14 != a7
																														&& a14 != a6
																														&& a14 != a5
																														&& a14 != a4
																														&& a14 != a3
																														&& a14 != a2
																														&& a14 != a1) {
																													for (p = 0; p < 15; p++) {
																														a15 = p;
																														if (a15 != a14
																																&& a15 != a13
																																&& a15 != a12
																																&& a15 != a11
																																&& a15 != a10
																																&& a15 != a9
																																&& a15 != a8
																																&& a15 != a7
																																&& a15 != a6
																																&& a15 != a5
																																&& a15 != a4
																																&& a15 != a3
																																&& a15 != a2
																																&& a15 != a1) {
																															num[0] = a1;
																															num[1] = a2;
																															num[2] = a3;
																															num[3] = a4;
																															num[4] = a5;
																															num[5] = a6;
																															num[6] = a7;
																															num[7] = a8;
																															num[8] = a9;
																															num[9] = a10;
																															num[10] = a11;
																															num[11] = a12;
																															num[12] = a13;
																															num[13] = a14;
																															num[14] = a15;
																															if (aa[0] == -1) {

																																return num;

																															}
																															if (test1(
																																	temp,
																																	num)) {
																																return num;
																															}
																															// System.out.println(a1+"
																															// "+a2+"
																															// "+a3+"
																															// "+a4+"
																															// "+a5+"
																															// "+a6+"
																															// "+a7+"
																															// "+a8+"
																															// "+a9+""+"
																															// "+a10+"
																															// "+a11+"
																															// "+a12+"
																															// "+a13+"
																															// "+a14+"
																															// "+a15);

																															// System.out.println(o);
																															// o++;
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}

																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return num;

	}

	// 用于测试两组中是否有重复的人，即（1,2,3）与（4,5,6）表示一天中每个人不能同时出去两次;
	public static boolean test(int a[], int b[]) {

		int i, j; // ,k=1;
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				if (a[i] == b[j]) {
					return false;
				}
			}
		}
		return true;
	}

	// 用于测试每一天出去的15人是否相同?
	public static boolean test1(int a[], int b[]) {
		int temp[][] = new int[5][3];
		int test[][] = new int[5][3];
		int i, j, k, x, y, z, m, f, g, l;

		k = 0;

		for (i = 0; i < 5; i++) {
			for (j = 0; j < 3; j++) {
				temp[i][j] = a[k];
				test[i][j] = b[k];
				k++;
			}
		}

		for (i = 0; i < 5; i++) {
			for (j = 0; j < 3; j++) {
				z = temp[i][j];
				for (x = 0; x < 5; x++) {
					for (y = 0; y < 3; y++) {
						if (z == test[x][y]) {
							for (m = 0; m < 3; m++) {
								if (temp[i][m] != z) {
									f = temp[i][m];
									for (g = 0; g < 3; g++) {
										if (test[x][g] != z) {
											l = test[x][g];
											if (f == l) {
												return false;
											}
										}
									}
								}

							}
						}
					}
				}
			}

		}

		return true;
	}

	// 用于测试同一组是否有两个以下的相同如（1,2,3)与(1,2,4)其中1,2,3表示一组中的第一个人;
	public static boolean test4(int a[], int b[]) {
		int i, j, k, x, y;
		for (i = 0; i < 3; i++) {
			k = a[i];
			for (j = 0; j < 3; j++) {
				if (k == b[j]) {
					for (x = 0; x < 3; x++) {
						if (a[x] != k) {
							for (y = 0; y < 3; y++) {
								if (a[x] == b[y]) {
									return false;
								}
							}
						}
					}
				}
			}
		}
		return true;
	}

	// 用于测试每一天外出的是否有重复如（1,2,3,4,5）与（5,4,3,2,1）其中1,2,3,4,5,表示一天中的第一组
	public static boolean test5(int a[], int b[]) {
		int i, j, k, x, y, z;
		int temp[][] = new int[5][3];
		int test[][] = new int[5][3];
		int temp1[] = new int[3];
		int test1[] = new int[3];
		x = 0;
		k = 0;

		for (i = 0; i < 5; i++) {
			for (j = 0; j < 3; j++) {
				temp[i][j] = a[k];
				test[i][j] = b[k];
				k++;
			}
		}
		for (i = 0; i < 5; i++) {
			for (z = 0; z < 3; z++) {
				temp1[z] = temp[i][z];
			}
			for (j = 0; j < 5; j++) {
				for (z = 0; z < 3; z++) {
					test1[z] = test[j][z];
				}
				if (test6(temp1, test1)) {
					x++;
				}
			}
			if (x == 5) {
				return false;
			}
		}

		return true;
	}
	
	// 用于测试每一组是否重复如（1,2,3）与（3,2,1）其中1,2,3,表示一组中的第一个人;
	public static boolean test6(int a[], int b[]) {
		int i, j = 0, k;

		for (i = 0; i < 3; i++) {
			for (k = 0; k < 3; k++) {
				if (a[i] == b[k]) {
					j++;
				}
				if (j == 3) {
					return true;
				}
			}
		}
		return false;
	}

	// 用于测试每一种组合是否复如（1,2,3,4,5,6,7）与（7,6,5,4,3,2,1）
	public static boolean test7(int a[][], int b[][]) {
		int temp[] = new int[15];
		int test[] = new int[15];
		int i, j, k, x, y;
		k = 0;
		for (i = 0; i < 7; i++) {
			for (j = 0; j < 15; j++) {
				temp[j] = a[i][j];
			}
			for (x = 0; x < 7; x++) {
				for (y = 0; y < 15; y++) {
					test[y] = b[x][y];
				}
			}
			if (test5(temp, test) == false) {
				k++;
			}
			if (k == 7) {
				return false;
			}

		}
		return true;
	}

}
